package kotlin.io;

import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j implements Iterator, l71.a {
    public String r;
    public boolean s;
    public final /* synthetic */ k t;

    public j(k kVar) {
        this.t = kVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.r == null && !this.s) {
            String readLine = ((BufferedReader) this.t.b).readLine();
            this.r = readLine;
            if (readLine == null) {
                this.s = true;
            }
        }
        return this.r != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String str = this.r;
        this.r = null;
        k71.k.d(str);
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
