package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q9 extends h {
    public boolean t;
    public boolean u;
    public final /* synthetic */ j4 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q9(j4 j4Var, boolean z, boolean z2) {
        super("log");
        this.v = j4Var;
        this.t = z;
        this.u = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0092  */
    @Override // com.google.android.gms.internal.measurement.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n c(w51.r rVar, List list) {
        int i;
        int i2;
        i21.a.W(1, "log", list);
        int size = list.size();
        r rVar2 = n.b;
        j4 j4Var = this.v;
        if (size == 1) {
            ((y51.c) j4Var.u).o(3, ((t) rVar.t).c(rVar, (n) list.get(0)).k(), Collections.EMPTY_LIST, this.t, this.u);
            return rVar2;
        }
        n nVar = (n) list.get(0);
        t tVar = (t) rVar.t;
        t tVar2 = (t) rVar.t;
        int b0 = i21.a.b0(tVar.c(rVar, nVar).d().doubleValue());
        if (b0 != 2) {
            i = 3;
            if (b0 == 3) {
                i2 = 1;
            } else if (b0 == 5) {
                i2 = 5;
            } else if (b0 == 6) {
                i2 = 2;
            }
            String k = tVar2.c(rVar, (n) list.get(1)).k();
            if (list.size() != 2) {
                ((y51.c) j4Var.u).o(i2, k, Collections.EMPTY_LIST, this.t, this.u);
                return rVar2;
            }
            ArrayList arrayList = new ArrayList();
            for (int i3 = 2; i3 < Math.min(list.size(), 5); i3++) {
                arrayList.add(tVar2.c(rVar, (n) list.get(i3)).k());
            }
            ((y51.c) j4Var.u).o(i2, k, arrayList, this.t, this.u);
            return rVar2;
        }
        i = 4;
        i2 = i;
        String k2 = tVar2.c(rVar, (n) list.get(1)).k();
        if (list.size() != 2) {
        }
    }
}
