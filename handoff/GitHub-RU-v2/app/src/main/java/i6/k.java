package i6;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes.dex */
public final class k extends z5.j {

    /* renamed from: d, reason: collision with root package name */
    public z5.n f26041d;

    /* renamed from: e, reason: collision with root package name */
    public int f26042e;

    /* renamed from: f, reason: collision with root package name */
    public int f26043f;

    public k() {
        super(0, 3);
        this.f26041d = z5.l.f34585a;
        this.f26042e = 0;
        this.f26043f = 0;
    }

    @Override // z5.h
    public final z5.h a() {
        k kVar = new k();
        kVar.f26041d = this.f26041d;
        kVar.f26042e = this.f26042e;
        kVar.f26043f = this.f26043f;
        ArrayList arrayList = this.f34584c;
        ArrayList arrayList2 = new ArrayList(x61.n.F(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(((z5.h) obj).a());
        }
        kVar.f34584c.addAll(arrayList2);
        return kVar;
    }

    @Override // z5.h
    public final void b(z5.n nVar) {
        this.f26041d = nVar;
    }

    @Override // z5.h
    public final z5.n c() {
        return this.f26041d;
    }

    public final String toString() {
        return "EmittableRow(modifier=" + this.f26041d + ", horizontalAlignment=" + ((Object) a.b(this.f26042e)) + ", verticalAlignment=" + ((Object) b.b(this.f26043f)) + ", children=[\n" + d() + "\n])";
    }
}
