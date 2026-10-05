package d6;

import java.util.ArrayList;
import z5.j;
import z5.l;
import z5.n;

/* loaded from: /home/user/work/p/classes.dex */
public final class a extends j {

    /* renamed from: d, reason: collision with root package name */
    public n f21592d;

    /* renamed from: e, reason: collision with root package name */
    public int f21593e;

    public a() {
        super(0, 1);
        this.f21592d = l.f34585a;
        this.f21593e = 0;
    }

    @Override // z5.h
    public final z5.h a() {
        a aVar = new a();
        aVar.f21592d = this.f21592d;
        aVar.f21593e = this.f21593e;
        ArrayList arrayList = this.f34584c;
        ArrayList arrayList2 = new ArrayList(x61.n.F(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(((z5.h) obj).a());
        }
        aVar.f34584c.addAll(arrayList2);
        return aVar;
    }

    @Override // z5.h
    public final void b(n nVar) {
        this.f21592d = nVar;
    }

    @Override // z5.h
    public final n c() {
        return this.f21592d;
    }

    public final String toString() {
        return "EmittableLazyList(modifier=" + this.f21592d + ", horizontalAlignment=" + ((Object) i6.a.b(this.f21593e)) + ", activityOptions=null, children=[\n" + d() + "\n])";
    }
}
