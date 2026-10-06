package i6;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes.dex */
public final class i extends z5.j {

    /* renamed from: d, reason: collision with root package name */
    public z5.n f26036d;

    /* renamed from: e, reason: collision with root package name */
    public c f26037e;

    public i() {
        super(0, 3);
        this.f26036d = z5.l.f34585a;
        this.f26037e = c.f26022c;
    }

    @Override // z5.h
    public final z5.h a() {
        i iVar = new i();
        iVar.f26036d = this.f26036d;
        iVar.f26037e = this.f26037e;
        ArrayList arrayList = this.f34584c;
        ArrayList arrayList2 = new ArrayList(x61.n.F(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(((z5.h) obj).a());
        }
        iVar.f34584c.addAll(arrayList2);
        return iVar;
    }

    @Override // z5.h
    public final void b(z5.n nVar) {
        this.f26036d = nVar;
    }

    @Override // z5.h
    public final z5.n c() {
        return this.f26036d;
    }

    public final String toString() {
        return "EmittableBox(modifier=" + this.f26036d + ", contentAlignment=" + this.f26037e + "children=[\n" + d() + "\n])";
    }
    public Object d = null;
    public Object e = null;
}
