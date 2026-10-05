package y71;

import rm0.v4;
import t00.f8;

/* loaded from: /home/user/work/p/classes5.dex */
public final class s1 implements r1 {
    public final /* synthetic */ int a;

    @Override // y71.r1
    public final i a(z71.z zVar) {
        switch (this.a) {
            case 0:
                return new f8(21, p1.r);
            default:
                return new f8(new v4(zVar, (a71.c) null, 23));
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "SharingStarted.Eagerly";
            default:
                return "SharingStarted.Lazily";
        }
    }
}
