package go0;

/* loaded from: /home/user/work/p/classes4.dex */
public final /* synthetic */ class b implements j71.e {
    public final /* synthetic */ int r;
    public final /* synthetic */ qn.d s;

    public /* synthetic */ b(qn.d dVar, int i) {
        this.r = i;
        this.s = dVar;
    }

    @Override // j71.e
    public final Object s(Object obj, Object obj2) {
        String str = (String) obj;
        switch (this.r) {
            case 0:
                f fVar = (f) obj2;
                k71.k.g(str, "<unused var>");
                if (fVar == null) {
                    return null;
                }
                String str2 = this.s.b;
                int i = fVar.b;
                k71.k.g(str2, "offSet");
                return new f(str2, i);
            case 1:
                hd0.d dVar = (hd0.d) obj2;
                k71.k.g(str, "<unused var>");
                if (dVar == null) {
                    return null;
                }
                String str3 = this.s.b;
                int i2 = dVar.b;
                k71.k.g(str3, "offSet");
                return new hd0.d(str3, i2);
            case 2:
                kp.d dVar2 = (kp.d) obj2;
                k71.k.g(str, "<unused var>");
                if (dVar2 == null) {
                    return null;
                }
                String str4 = this.s.b;
                int i3 = dVar2.b;
                String str5 = dVar2.c;
                k71.k.g(str4, "offSet");
                k71.k.g(str5, "subscriptionId");
                return new kp.d(str4, i3, str5);
            default:
                r20.d dVar3 = (r20.d) obj2;
                k71.k.g(str, "<unused var>");
                if (dVar3 == null) {
                    return null;
                }
                String str6 = this.s.b;
                int i4 = dVar3.b;
                k71.k.g(str6, "offSet");
                return new r20.d(str6, i4);
        }
    }
}
