package a9;

import a61.n0;
import b9.g;
import k71.k;
import y71.n1;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final g f604a;

    public b(g gVar) {
        k.g(gVar, "tracker");
        this.f604a = gVar;
    }

    @Override // a9.d
    public final y71.c a(v8.f fVar) {
        k.g(fVar, "constraints");
        return n1.h(new n0(this, (a71.c) null, 2));
    }

    public abstract int c();

    public abstract boolean d(Object obj);

}
