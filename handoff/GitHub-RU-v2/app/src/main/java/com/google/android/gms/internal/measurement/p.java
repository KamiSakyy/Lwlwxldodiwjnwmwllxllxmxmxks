package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p implements Iterator {
    public final /* synthetic */ int r;
    public int s = 0;
    public final /* synthetic */ q t;

    public /* synthetic */ p(q qVar, int i) {
        this.r = i;
        this.t = qVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.r) {
            case 0:
                if (this.s < this.t.r.length()) {
                }
                break;
            default:
                if (this.s < this.t.r.length()) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        switch (this.r) {
            case 0:
                String str = this.t.r;
                int i = this.s;
                if (i >= str.length()) {
                    throw new NoSuchElementException();
                }
                this.s = i + 1;
                return new q(String.valueOf(i));
            default:
                q qVar = this.t;
                String str2 = qVar.r;
                int i2 = this.s;
                if (i2 >= str2.length()) {
                    throw new NoSuchElementException();
                }
                this.s = i2 + 1;
                return new q(String.valueOf(qVar.r.charAt(i2)));
        }
    }




}
