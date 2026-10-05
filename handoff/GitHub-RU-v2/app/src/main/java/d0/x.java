package d0;

import a0.l2;
import java.util.ArrayList;
import java.util.ListIterator;

/* loaded from: /home/user/work/p/classes.dex */
public final class x implements l2 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f20987a;

    public x(ArrayList arrayList) {
        this.f20987a = arrayList;
    }

    @Override // a0.i2
    public final long b(a0.u uVar, a0.u uVar2, a0.u uVar3) {
        w61.k kVar = (w61.k) x61.m.e0(this.f20987a);
        return ((l2) kVar.s).b(uVar, uVar2, uVar3) + ((Number) kVar.r).longValue();
    }

    public final w61.k c(long j10) {
        Object obj;
        ArrayList arrayList = this.f20987a;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((Number) ((w61.k) obj).r).longValue() <= j10) {
                break;
            }
        }
        w61.k kVar = (w61.k) obj;
        return kVar == null ? (w61.k) x61.m.U(arrayList) : kVar;
    }

    @Override // a0.i2
    public final a0.u d(long j10, a0.u uVar, a0.u uVar2, a0.u uVar3) {
        w61.k c10 = c(j10);
        return ((l2) c10.s).d(j10 - ((Number) c10.r).longValue(), uVar, uVar2, uVar3);
    }

    @Override // a0.i2
    public final a0.u h(long j10, a0.u uVar, a0.u uVar2, a0.u uVar3) {
        w61.k c10 = c(j10);
        return ((l2) c10.s).h(j10 - ((Number) c10.r).longValue(), uVar, uVar2, uVar3);
    }
}
