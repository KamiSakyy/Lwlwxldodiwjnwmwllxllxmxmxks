package com.github.rudroid.copilot.inapppurchase.billingclient;

import a81.t;
import com.google.android.gms.internal.play_billing.r;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import x9.p;
import x9.q;
import xn.d1;
import xn.e1;

/* loaded from: /home/user/work/p/classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final p f9671a;

    /* renamed from: b, reason: collision with root package name */
    public static final k50.c f9672b;

    public static final /* synthetic */ class a {
        static {
            int[] iArr = new int[e1.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d1 d1Var = e1.Companion;
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d1 d1Var2 = e1.Companion;
                iArr[4] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        List<String> r10 = x61.l.r(new String[]{"com.github.rudroid.copilot.monthly", "com.github.rudroid.copilot.pro.plus", "com.github.rudroid.copilot.max"});
        ArrayList arrayList = new ArrayList(x61.n.F(r10, 10));
        for (String str : r10) {
            t tVar = new t(12);
            tVar.s = str;
            if (str == null) {
                throw new IllegalArgumentException("Product id must be provided.");
            }
            arrayList.add(new q(tVar));
        }
        p pVar = new p();
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("Product list cannot be empty.");
        }
        HashSet hashSet = new HashSet();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((q) obj).getClass();
            hashSet.add("subs");
        }
        if (hashSet.size() > 1) {
            throw new IllegalArgumentException("All products should be of the same product type.");
        }
        r k10 = r.k(arrayList);
        pVar.f34027a = k10;
        if (k10 == null) {
            throw new IllegalArgumentException("Product list must be set to a non empty list.");
        }
        p pVar2 = new p();
        pVar2.f34027a = pVar.f34027a;
        f9671a = pVar2;
        f9672b = new k50.c(9);
    }

    public static final String a(e1 e1Var) {
        k71.k.g(e1Var, "<this>");
        int ordinal = e1Var.ordinal();
        return ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? "com.github.rudroid.copilot.monthly" : "com.github.rudroid.copilot.max" : "com.github.rudroid.copilot.pro.plus" : "com.github.rudroid.copilot.monthly";
    }
}
