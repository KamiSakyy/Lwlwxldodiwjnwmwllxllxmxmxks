package h1;

import java.util.Iterator;
import java.util.Map;

/* loaded from: /home/user/work/p/classes.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public Map f25438a;

    public v0(Map map) {
        this.f25438a = map;
    }

    public final Object a(float f6) {
        Object next;
        Iterator it = this.f25438a.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float abs = Math.abs(f6 - ((Number) ((Map.Entry) next).getValue()).floatValue());
                do {
                    Object next2 = it.next();
                    float abs2 = Math.abs(f6 - ((Number) ((Map.Entry) next2).getValue()).floatValue());
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

    public final Object b(float f6, boolean z10) {
        Object next;
        Iterator it = this.f25438a.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float floatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
                float f10 = z10 ? floatValue - f6 : f6 - floatValue;
                if (f10 < 0.0f) {
                    f10 = Float.POSITIVE_INFINITY;
                }
                do {
                    Object next2 = it.next();
                    float floatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                    float f11 = z10 ? floatValue2 - f6 : f6 - floatValue2;
                    if (f11 < 0.0f) {
                        f11 = Float.POSITIVE_INFINITY;
                    }
                    if (Float.compare(f10, f11) > 0) {
                        next = next2;
                        f10 = f11;
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

    public final float c() {
        Float i02 = x61.m.i0(this.f25438a.values());
        if (i02 != null) {
            return i02.floatValue();
        }
        return Float.NaN;
    }

    public final float d(Object obj) {
        Float f6 = (Float) this.f25438a.get(obj);
        if (f6 != null) {
            return f6.floatValue();
        }
        return Float.NaN;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        return k71.k.b(this.f25438a, ((v0) obj).f25438a);
    }

    public final int hashCode() {
        return this.f25438a.hashCode() * 31;
    }

    public final String toString() {
        return "MapDraggableAnchors(" + this.f25438a + ')';
    }
}
