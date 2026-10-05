package i6;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes.dex */
public final class j extends z5.j {

    /* renamed from: d, reason: collision with root package name */
    public z5.n f26038d;

    /* renamed from: e, reason: collision with root package name */
    public int f26039e;

    /* renamed from: f, reason: collision with root package name */
    public int f26040f;

    public j() {
        super(0, 3);
        this.f26038d = z5.l.f34585a;
        this.f26039e = 0;
        this.f26040f = 0;
    }

    @Override // z5.h
    public final z5.h a() {
        j jVar = new j();
        jVar.f26038d = this.f26038d;
        jVar.f26039e = this.f26039e;
        jVar.f26040f = this.f26040f;
        ArrayList arrayList = this.f34584c;
        ArrayList arrayList2 = new ArrayList(x61.n.F(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(((z5.h) obj).a());
        }
        jVar.f34584c.addAll(arrayList2);
        return jVar;
    }

    @Override // z5.h
    public final void b(z5.n nVar) {
        this.f26038d = nVar;
    }

    @Override // z5.h
    public final z5.n c() {
        return this.f26038d;
    }

    public final String toString() {
        return "EmittableColumn(modifier=" + this.f26038d + ", verticalAlignment=" + ((Object) b.b(this.f26039e)) + ", horizontalAlignment=" + ((Object) a.b(this.f26040f)) + ", children=[\n" + d() + "\n])";
    }
}
