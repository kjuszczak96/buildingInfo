package pl.put.poznan.transformer.rest;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.put.poznan.transformer.logic.SimpleObject;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class ObjectController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    List<SimpleObject> list = new ArrayList<>();

    @RequestMapping("/greeting")
    public List<SimpleObject> greeting(@RequestParam(value="name", defaultValue="World") String name) {
        for (int i = 0; i < 100; i++)
            list.add(
                    new SimpleObject(counter.incrementAndGet(),
                            String.format(template, name),
                            counter.incrementAndGet()*100));
        return list;
    }
}