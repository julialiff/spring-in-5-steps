package com.in28minutes.spring.basics.springin5steps;

import com.in28minutes.spring.basics.springin5steps.scope.PersonDAO;
import org.apache.commons.logging.LogFactory;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.logging.Logger;

@SpringBootApplication
public class SpringIn5StepsScopeApplication {

    private static org.slf4j.Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);

	public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsScopeApplication.class, args);

        PersonDAO personDao = applicationContext.getBean(PersonDAO.class);

        PersonDAO personDao2 = applicationContext.getBean(PersonDAO.class);

        LOGGER.info("{}", personDao);
        LOGGER.info("{}", personDao.getJdbcConnection());

        LOGGER.info("{}", personDao2);
        LOGGER.info("{}", personDao2.getJdbcConnection());


//		System.out.println("Starting");
//		BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
//		int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 12);
//		System.out.println(result);
//		System.out.println("Finished");
//
//		new BinarySearchImpl(new QuickSortAlgorithm());
//
//		SpringApplication.run(SpringIn5StepsApplication.class, args);

//		ApplicationContext applicationContext =  SpringApplication.run(SpringIn5StepsApplication.class, args);
//		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
//		int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);
//		System.out.println(result);
	}
}
