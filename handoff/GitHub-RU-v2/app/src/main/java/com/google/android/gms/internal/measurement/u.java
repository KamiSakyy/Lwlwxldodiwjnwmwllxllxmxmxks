package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u implements Comparator {
    public final /* synthetic */ h a;
    public final /* synthetic */ w51.r b;

    public u(h hVar, w51.r rVar) {
        this.a = hVar;
        this.b = rVar;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        n nVar = (n) obj;
        n nVar2 = (n) obj2;
        if (nVar instanceof r) {
            return !(nVar2 instanceof r) ? 1 : 0;
        }
        if (nVar2 instanceof r) {
            return -1;
        }
        h hVar = this.a;
        return hVar == null ? nVar.k().compareTo(nVar2.k()) : (int) i21.a.c0(hVar.c(this.b, Arrays.asList(nVar, nVar2)).d().doubleValue());
    }
}
