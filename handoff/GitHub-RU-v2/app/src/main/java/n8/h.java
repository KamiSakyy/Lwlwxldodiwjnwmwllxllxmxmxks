package n8;

import k71.k;

/* loaded from: /home/user/work/p/classes.dex */
public final class h extends k21.f {

    /* renamed from: c, reason: collision with root package name */
    public final Object f29662c;

    /* renamed from: d, reason: collision with root package name */
    public final i f29663d;

    /* renamed from: e, reason: collision with root package name */
    public final a f29664e;

    public h(Object obj, i iVar, a aVar) {
        k.g(obj, "value");
        k.g(iVar, "verificationMode");
        this.f29662c = obj;
        this.f29663d = iVar;
        this.f29664e = aVar;
    }

    public final k21.f B(j71.c cVar, String str) {
        Object obj = this.f29662c;
        return ((Boolean) cVar.k(obj)).booleanValue() ? this : new g(obj, str, this.f29664e, this.f29663d);
    }

    public final Object k() {
        return this.f29662c;
    }
}
