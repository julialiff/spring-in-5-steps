package com.in28minutes.spring.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {

    @Autowired
    @Qualifier("binary")
    private SortAlgorithm sortAlgorithm;

    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        super();
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] numbers, int numberSearched) {
        numbers = sortAlgorithm.sort(numbers);

        int low = 0;
        int high = numbers.length - 1;
        int index = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (numbers[mid] < numberSearched) {
                low = mid + 1;
            } else if (numbers[mid] > numberSearched) {
                high = mid - 1;
            } else if (numbers[mid] == numberSearched) {
                index = mid;
                break;
            }
        }
        return index;
    }

}