package b6;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes.dex */
public final class z extends z5.j {

    /* renamed from: d, reason: collision with root package name */
    public long f3739d;

    /* renamed from: e, reason: collision with root package name */
    public x1 f3740e;

    public z() {
        super(0, 3);
        this.f3739d = 9205357640488583168L;
        this.f3740e = w1.f3727a;
    }

    @Override // z5.h
    public final z5.h a() {
        z zVar = new z();
        zVar.f3739d = this.f3739d;
        zVar.f3740e = this.f3740e;
        ArrayList arrayList = this.f34584c;
        ArrayList arrayList2 = new ArrayList(x61.n.F(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(((z5.h) obj).a());
        }
        zVar.f34584c.addAll(arrayList2);
        return zVar;
    }

    @Override // z5.h
    public final void b(z5.n nVar) {
        throw new IllegalAccessError("You cannot set the modifier of an EmittableSizeBox");
    }

    @Override // z5.h
    public final z5.n c() {
        z5.n c10;
        ArrayList arrayList = this.f34584c;
        k71.k.g(arrayList, "<this>");
        z5.h hVar = (z5.h) (arrayList.size() == 1 ? arrayList.get(0) : null);
        return (hVar == null || (c10 = hVar.c()) == null) ? k41.b.t(z5.l.f34585a).d(new i6.m(n6.d.f29640a)) : c10;
    }

    public final String toString() {
        return "EmittableSizeBox(size=" + ((Object) s3.h.c(this.f3739d)) + ", sizeMode=" + this.f3740e + ", children=[\n" + d() + "\n])";
    }
}
