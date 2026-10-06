package com.github.domain.searchandfilter.filters.data;

import android.os.Parcelable;
import bm.l;
import com.google.android.gms.internal.measurement.d5;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import k71.k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import sy.w;

@g81.e
/* loaded from: /home/user/work/p/classes3.dex */
public abstract class d implements Parcelable {
    public static final Filter$Companion Companion = new Filter$Companion();
    public static final w61.h[] t;
    public static final Object u;
    public l r;
    public String s;

    static {
        w61.i iVar = w61.i.r;
        t = new w61.h[]{w.s(iVar, new bm.i(2)), null};
        u = w.s(iVar, new bm.i(3));
    }

    public /* synthetic */ d(int i, l lVar, String str) {
        this.r = lVar;
        if ((i & 2) == 0) {
            this.s = lVar.name();
        } else {
            this.s = str;
        }
    }

    public static final /* synthetic */ void y(d dVar, d5 d5Var, SerialDescriptor serialDescriptor) {
        KSerializer kSerializer = (KSerializer) t[0].getValue();
        l lVar = dVar.r;
        String str = dVar.s;
        d5Var.I(serialDescriptor, 0, kSerializer, lVar);
        if (!d5Var.X(serialDescriptor) && k.b(str, dVar.r.name())) {
            return;
        }
        d5Var.J(serialDescriptor, 1, str);
    }

    public abstract boolean c();

    public boolean h(Set set) {
        k.g(set, "capabilities");
        return true;
    }

    public d j(ArrayList arrayList, boolean z) {
        return null;
    }

    public abstract String o();

    public abstract String r(List list);

    public d(l lVar, String str) {
        this.r = lVar;
        this.s = str;
    }
    public Object s(Object p1) { return null; }
    public Object s(int p1) { return null; }
}
