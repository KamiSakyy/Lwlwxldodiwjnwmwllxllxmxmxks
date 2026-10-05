package com.github.rudroid.createrepository;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class r implements j71.c {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f10607r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q f10608s;

    public /* synthetic */ r(q qVar, int i) {
        this.f10607r = i;
        this.f10608s = qVar;
    }

    public final Object k(Object obj) {
        fl.b bVar = (fl.b) obj;
        switch (this.f10607r) {
            case k5.f.J:
                q qVar = this.f10608s;
                qVar.P(qVar.f10606z, bVar, false);
                break;
            case 1:
                q qVar2 = this.f10608s;
                qVar2.P(qVar2.A, bVar, false);
                break;
            default:
                q qVar3 = this.f10608s;
                qVar3.P(qVar3.A, bVar, false);
                break;
        }
        return w61.a0.a;
    }
}
