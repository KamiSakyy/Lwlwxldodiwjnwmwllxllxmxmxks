package y71;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /home/user/work/p/classes5.dex */
public final class z1 extends z71.c {
    public final AtomicReference a = new AtomicReference(null);

    @Override // z71.c
    public final boolean a(z71.a aVar) {
        AtomicReference atomicReference = this.a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(n1Shadow.b);
        return true;
    }

    @Override // z71.c
    public final a71.c[] b(z71.a aVar) {
        this.a.set(null);
        return z71.b.a;
    }
}
