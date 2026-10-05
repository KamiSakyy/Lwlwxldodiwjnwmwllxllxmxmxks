package vb;

import java.util.ArrayList;
import k71.k;
import vb.a;

/* loaded from: /home/user/work/p/classes.dex */
public final class g<G extends a<?>> {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f32870a;

    /* renamed from: b, reason: collision with root package name */
    public final e f32871b;

    public g(ArrayList arrayList, e eVar) {
        this.f32870a = arrayList;
        this.f32871b = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f32870a.equals(gVar.f32870a) && k.b(this.f32871b, gVar.f32871b);
    }

    public final int hashCode() {
        int hashCode = this.f32870a.hashCode() * 31;
        e eVar = this.f32871b;
        return hashCode + (eVar == null ? 0 : eVar.hashCode());
    }

    public final String toString() {
        return "ReducedPagingGroupCollection(reducedGroups=" + this.f32870a + ", nextPage=" + this.f32871b + ")";
    }
}
