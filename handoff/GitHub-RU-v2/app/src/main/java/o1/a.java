package o1;

import java.util.Map;

/* loaded from: /home/user/work/p/classes.dex */
public class a implements Map.Entry, l71.a {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f29901r;

    /* renamed from: s, reason: collision with root package name */
    public Object f29902s;

    /* renamed from: t, reason: collision with root package name */
    public Object f29903t;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.f29901r = i;
        this.f29902s = obj;
        this.f29903t = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        switch (this.f29901r) {
            case k5.f.J /* 0 */:
                Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                return entry != null && k71.k.b(entry.getKey(), this.f29902s) && k71.k.b(entry.getValue(), getValue());
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.f29901r) {
        }
        return this.f29902s;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        switch (this.f29901r) {
        }
        return this.f29903t;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        switch (this.f29901r) {
            case k5.f.J /* 0 */:
                Object obj = this.f29902s;
                int hashCode = obj != null ? obj.hashCode() : 0;
                Object value = getValue();
                return (value != null ? value.hashCode() : 0) ^ hashCode;
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        switch (this.f29901r) {
            case k5.f.J /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public String toString() {
        switch (this.f29901r) {
            case k5.f.J /* 0 */:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f29902s);
                sb2.append('=');
                sb2.append(getValue());
                return sb2.toString();
            default:
                return super.toString();
        }
    }
}
