package com.example.history_table_proof_of_concept;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
class TestController {

    private final TestRepo testRepo;
    private final TestDao testDao;
    private final TestRepoBasket testRepoBasket;

    TestController(TestRepo testRepo, TestDao testDao, TestRepoBasket testRepoBasket) {
        this.testRepo = testRepo;
        this.testDao = testDao;
        this.testRepoBasket = testRepoBasket;
    }

    @GetMapping(value = "/test")
    public List<Fruit> test() {
//        Fruit myFruit = new Fruit();
//        myFruit.setColor("GReen");
        List<Fruit> fruits = new ArrayList<>();
        testRepo.findAll().forEach(fruits::add);
        return fruits;
    }

    @PostMapping(value = "/test")
    public void test(@RequestBody Fruit fruit) {
        testRepo.save(fruit);
    }

    @GetMapping(value = "/testJDBC")
    public void testJDBC() {
        testDao.insertRecordTest();
    }

    @PostMapping(value = "/testBasket")
    public void testBasket(@RequestBody Basket basket) {
//        testRepoBasket.save(basket);
        testRepoBasket.insertBasket();
//        basket.getFruits().stream().forEach(fruit -> {
//            fruit.setBasket_id(basket.getId());
//            testRepo.save(fruit);
//        });
//        testRepo.saveAll(basket.getFruits());
    }

    @GetMapping(value = "/testBasket")
    public List<Basket> testBasket() {
        List<Basket> baskets = new ArrayList<>();
        testRepoBasket.findAll().forEach(baskets::add);
        return baskets;
    }

    @GetMapping("/testManualInsert")
    public void  testManualInsert() {
//        testRepo.insertFruit();
        testRepo.updateFruit();
    }

    @GetMapping("/testManualGetAll")
    public List<Fruit> testManualGetAll() {
        return testRepo.getFruit();
    }
}
