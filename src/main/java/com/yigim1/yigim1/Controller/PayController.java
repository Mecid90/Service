package com.yigim1.yigim1.Controller;
import com.yigim1.yigim1.model.Pay;
import com.yigim1.yigim1.model.Check;
import com.yigim1.yigim1.service.Servis;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;


@RestController
@RequestMapping
public class PayController {

    Servis servis = new Servis();

    @PostMapping("/payinvoice")
    public String payment(@RequestBody Pay pay) {
        servis.checkPayment(pay);
        return "success";
    }


    @PostMapping("/checkInvoice/invoiceRef={refNumber}")
    public String getInvoice(@PathParam("refNo") Check check, Pay pay){

            if(check.getRefNumber().equals(pay.getRefNumber())){
                servis.checkPayment(pay);
            }
        return "success";
    }

}
