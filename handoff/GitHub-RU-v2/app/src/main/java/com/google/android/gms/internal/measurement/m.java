package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m extends h {
    public ArrayList t;
    public ArrayList u;
    public w51.r v;

    public m(m mVar) {
        super(mVar.r);
        ArrayList arrayList = new ArrayList(mVar.t.size());
        this.t = arrayList;
        arrayList.addAll(mVar.t);
        ArrayList arrayList2 = new ArrayList(mVar.u.size());
        this.u = arrayList2;
        arrayList2.addAll(mVar.u);
        this.v = mVar.v;
    }

    @Override // com.google.android.gms.internal.measurement.h
    public final n c(w51.r rVar, List list) {
        r rVar2;
        w51.r Z = this.v.Z();
        t tVar = (t) Z.t;
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.t;
            int size = arrayList.size();
            rVar2 = n.b;
            if (i2 >= size) {
                break;
            }
            if (i2 < list.size()) {
                Z.c0((String) arrayList.get(i2), ((t) rVar.t).c(rVar, (n) list.get(i2)));
            } else {
                Z.c0((String) arrayList.get(i2), rVar2);
            }
            i2++;
        }
        ArrayList arrayList2 = this.u;
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj = arrayList2.get(i);
            i++;
            n nVar = (n) obj;
            n c = tVar.c(Z, nVar);
            if (c instanceof o) {
                c = tVar.c(Z, nVar);
            }
            if (c instanceof f) {
                return ((f) c).r;
            }
        }
        return rVar2;
    }

    @Override // com.google.android.gms.internal.measurement.h, com.google.android.gms.internal.measurement.n
    public final n l() {
        return new m(this);
    }

    public m(String str, ArrayList arrayList, List list, w51.r rVar) {
        super(str);
        this.t = new ArrayList();
        this.v = rVar;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                this.t.add(((n) obj).k());
            }
        }
        this.u = new ArrayList(list);
    }
}
