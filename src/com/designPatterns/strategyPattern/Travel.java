package com.designPatterns.strategyPattern;

/**
 * Created by gongtuo on 2017/5/27.
 */
public class Travel {
        private String address;
        private Vehicle vehicle;

        public  Travel(String address){
            this.address=address;
            this.vehicle=new Train();
        }
        /*
        策略替换接口
         */
        public void setVehicle(Vehicle vehicle){
            this.vehicle=vehicle;
        }
        public void travel(){
            vehicle.go(address);
        }

}
