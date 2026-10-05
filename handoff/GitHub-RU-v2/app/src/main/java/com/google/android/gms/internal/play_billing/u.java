package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Set;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class u extends o implements Set {
    public transient r s;

    @Override // com.google.android.gms.internal.play_billing.o
    public r e() {
        r rVar = this.s;
        if (rVar != null) {
            return rVar;
        }
        r i = i();
        this.s = i;
        return i;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    return containsAll(set);
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    public r i() {
        Object[] array = toArray(o.r);
        p pVar = r.s;
        return r.j(array.length, array);
    }
}
