package com.github.rudroid.uitoolkit.swipetodismiss;

import java.util.Iterator;
import java.util.Map;

/* loaded from: /home/user/work/p/classes3.dex */
final class d0<T> implements y<T> {
    public Map a;

    public d0(Map map) {
        k71.k.g(map, "anchors");
        this.a = map;
    }

    @Override // com.github.rudroid.uitoolkit.swipetodismiss.y
    public final float a() {
        Float i0 = x61.m.i0(this.a.values());
        if (i0 != null) {
            return i0.floatValue();
        }
        return Float.NaN;
    }

    @Override // com.github.rudroid.uitoolkit.swipetodismiss.y
    public final Object b(float f, boolean z) {
        T next;
        Iterator<T> it = this.a.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float floatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
                float f2 = z ? floatValue - f : f - floatValue;
                if (f2 < 0.0f) {
                    f2 = Float.POSITIVE_INFINITY;
                }
                do {
                    T next2 = it.next();
                    float floatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                    float f3 = z ? floatValue2 - f : f - floatValue2;
                    if (f3 < 0.0f) {
                        f3 = Float.POSITIVE_INFINITY;
                    }
                    if (Float.compare(f2, f3) > 0) {
                        next = next2;
                        f2 = f3;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return entry.getKey();
        }
        return null;
    }

    @Override // com.github.rudroid.uitoolkit.swipetodismiss.y
    public final Object c(float f) {
        T next;
        Iterator<T> it = this.a.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float abs = Math.abs(f - ((Number) ((Map.Entry) next).getValue()).floatValue());
                do {
                    T next2 = it.next();
                    float abs2 = Math.abs(f - ((Number) ((Map.Entry) next2).getValue()).floatValue());
                    if (Float.compare(abs, abs2) > 0) {
                        next = next2;
                        abs = abs2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return entry.getKey();
        }
        return null;
    }

    @Override // com.github.rudroid.uitoolkit.swipetodismiss.y
    public final float d(Object obj) {
        Float f = (Float) this.a.get(obj);
        if (f != null) {
            return f.floatValue();
        }
        return Float.NaN;
    }

    @Override // com.github.rudroid.uitoolkit.swipetodismiss.y
    public final boolean e(Object obj) {
        return this.a.containsKey(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        return k71.k.b(this.a, ((d0) obj).a);
    }

    @Override // com.github.rudroid.uitoolkit.swipetodismiss.y
    public final float f() {
        Float h0 = x61.m.h0(this.a.values());
        if (h0 != null) {
            return h0.floatValue();
        }
        return Float.NaN;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "MapDraggableAnchors(" + this.a + ")";
    }
}
