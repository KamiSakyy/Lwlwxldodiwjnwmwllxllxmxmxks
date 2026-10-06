package y71;

import androidx.compose.runtime.f2;

/* loaded from: /home/user/work/p/classes5.dex */
public final class v1 implements r1 {
    public final long a;

    public v1(long j) {
        this.a = j;
        if (j >= 0) {
            return;
        }
        throw new IllegalArgumentException(("stopTimeout(" + j + " ms) cannot be negative").toString());
    }

    @Override // y71.r1
    public final i a(z71.z zVar) {
        return n1.p(new y(n1.I(zVar, new u1(this, null)), new f2(2, (a71.c) null, 9), 3));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v1) {
            return this.a == ((v1) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(Long.MAX_VALUE) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        y61.b bVar = new y61.b(2);
        long j = this.a;
        if (j > 0) {
            bVar.add("stopTimeout=" + j + "ms");
        }
        return a0.s0.m(new StringBuilder("SharingStarted.WhileSubscribed("), x61.m.c0(sy.d0.h(bVar), (String) null, (String) null, (String) null, 0, (j71.c) null, 63), ')');
    }
}
