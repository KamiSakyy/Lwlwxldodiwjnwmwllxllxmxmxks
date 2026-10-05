package k6;

import w61.a0;

/* loaded from: /home/user/work/p/classes.dex */
public final class s extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ boolean f27790v;

    public final a71.c r(a71.c cVar, Object obj) {
        s sVar = new s(2, cVar);
        sVar.f27790v = ((Boolean) obj).booleanValue();
        return sVar;
    }

    public final Object s(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((s) r((a71.c) obj2, bool)).v(a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        return Boolean.valueOf(this.f27790v);
    }
}
