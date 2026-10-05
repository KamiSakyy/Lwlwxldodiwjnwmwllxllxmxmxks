package com.github.rudroid.settings.copilot;

import com.android.billingclient.api.Purchase;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public static eg.a a(x9.l lVar, Purchase purchase) {
        k71.k.g(purchase, "existingPurchase");
        ZonedDateTime plusMonths = ZonedDateTime.ofInstant(Instant.ofEpochMilli(purchase.c.optLong("purchaseTime")), ZoneId.systemDefault()).plusMonths(1L);
        String a = lVar != null ? com.github.rudroid.copilot.inapppurchase.billingclient.n.a(lVar) : null;
        if (a == null) {
            a = "";
        }
        k71.k.d(plusMonths);
        return new eg.a(a, plusMonths);
    }
}
