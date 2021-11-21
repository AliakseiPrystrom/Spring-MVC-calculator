package by.tms.service;

import by.tms.entity.Operation;
import org.springframework.stereotype.Service;

@Service
public class CalcService {

    public double calc(Operation operation){
        switch (operation.getOperation()){
            case ("+"):return Double.parseDouble(operation.getNum1())+Double.parseDouble(operation.getNum2());
            case ("-"):return Double.parseDouble(operation.getNum1())-Double.parseDouble(operation.getNum2());
            case ("*"):return Double.parseDouble(operation.getNum1())*Double.parseDouble(operation.getNum2());
            case ("/"):return Double.parseDouble(operation.getNum1())/Double.parseDouble(operation.getNum2());
        }return 0;
    }
}
