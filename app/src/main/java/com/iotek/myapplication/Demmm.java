package com.iotek.myapplication;

import java.util.ArrayList;
import java.util.List;

public class Demmm {


    public static void main(String[] args) {
        List<DeviceRightVo> vos1 = new ArrayList<>();
        List<DeviceRightVo> vos2 = new ArrayList<>();
        List<DeviceRightVo> vos3 = new ArrayList<>();
        List<DeviceRightVo> vos4 = new ArrayList<>();
//        vos1.add(new DeviceRightVo("es02","44444",""));
        vos1.add(new DeviceRightVo("es02","111","555"));
        vos1.add(new DeviceRightVo("es02","2222",""));
        vos1.add(new DeviceRightVo("es02","",""));


//        vos2.add(new DeviceRightVo("es02","111",""));
//        vos2.add(new DeviceRightVo("es02","6666 ",""));
//        vos2.add(new DeviceRightVo("es02","111","555"));
//        vos2.add(new DeviceRightVo("es02","111","333"));
        vos2.add(new DeviceRightVo("es02","",""));
        vos2.add(new DeviceRightVo("es02","2222",""));




//        vos2.add(new DeviceRightVo("es03","111",""));
//        vos2.add(new DeviceRightVo("es03","111",""));

        int index = 0;
        boolean b = false;
        DeviceRightVo vo2 = null;
        for (int i = 0;i< vos1.size(); i++){
            DeviceRightVo vo = vos1.get(i);
            for (int j = 0;j<vos2.size(); j++){
                 vo2 = vos2.get(j);
                if (vo.getDeviceCode().equals(vo2.getDeviceCode())){
                    if (vo.getOfferCode().equals(vo2.getOfferCode())){
                        index = j;
                        if (vo.getItemCode().equals(vo2.getItemCode())){
                            vos3.add(vo2);
                            System.out.println("1111");
                            break;
                        }else {
                            if (index  == vos2.size() -1){
                                b = true;
                                System.out.println("  2222    ");
                            }
                        }
                    }else {
                    if ("".equals(vo2.getOfferCode()) ){
                            vos3.add(vo2);
                            System.out.println("  33333  ");
                            break;
                        }
                    }
                }
            }
        }

        if (b){
            for (DeviceRightVo v :vos2){
                if (vo2.getDeviceCode().equals(v.getDeviceCode()) && vo2.getOfferCode().equals(v.getOfferCode())){
                    if ("".equals(v.getItemCode())){
                        vos3.add(v);
                        break;
                    }
                }
            }
        }


        System.out.println(vos3.toString());

    }
}
