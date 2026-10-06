package fa1;

import java.lang.reflect.Type;

/* loaded from: /home/user/work/p/classes5.dex */
public final class j implements g {
    public final /* synthetic */ int r;
    public final Type s;

    public /* synthetic */ j(int i, Type type) {
        this.r = i;
        this.s = type;
    }

    @Override // fa1.g
    public final Object c(z zVar) {
        switch (this.r) {
            case 0:
                k kVar = new k(zVar);
                zVar.m(new i(kVar, 0));
                return kVar;
            default:
                k kVar2 = new k(zVar);
                zVar.m(new i(kVar2, 1));
                return kVar2;
        }
    }

    @Override // fa1.g
    public final Type e() {
        switch (this.r) {
        }
        return this.s;
    }
}
