package kotlin.io;

import java.io.File;
import java.util.ArrayDeque;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e extends x61.b {
    public ArrayDeque t;
    public final /* synthetic */ g u;

    public e(g gVar) {
        this.u = gVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.t = arrayDeque;
        File file = (File) gVar.b;
        if (file.isDirectory()) {
            arrayDeque.push(b(file));
        } else if (file.isFile()) {
            arrayDeque.push(new c(file));
        } else {
            this.r = 2;
        }
    }

    @Override // x61.b
    public final void a() {
        File file;
        File a;
        while (true) {
            ArrayDeque arrayDeque = this.t;
            f fVar = (f) arrayDeque.peek();
            if (fVar == null) {
                file = null;
                break;
            }
            a = fVar.a();
            if (a == null) {
                arrayDeque.pop();
            } else if (a.equals(fVar.a) || !a.isDirectory() || arrayDeque.size() >= Integer.MAX_VALUE) {
                break;
            } else {
                arrayDeque.push(b(a));
            }
        }
        file = a;
        if (file == null) {
            this.r = 2;
        } else {
            this.s = file;
            this.r = 1;
        }
    }

    public final a b(File file) {
        int ordinal = ((h) this.u.c).ordinal();
        if (ordinal == 0) {
            return new d(file);
        }
        if (ordinal == 1) {
            return new b(file);
        }
        throw new NoWhenBranchMatchedException();
    }
}
