package ea;

import com.apollographql.apollo.exception.JsonDataException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import x61.m;
import x61.r;

/* loaded from: /home/user/work/p/classes.dex */
public final class g implements e {

    /* renamed from: r, reason: collision with root package name */
    public final Object f22190r;

    /* renamed from: s, reason: collision with root package name */
    public final List f22191s;

    /* renamed from: t, reason: collision with root package name */
    public d f22192t;

    /* renamed from: u, reason: collision with root package name */
    public Object f22193u;

    /* renamed from: v, reason: collision with root package name */
    public Object[] f22194v;

    /* renamed from: w, reason: collision with root package name */
    public Map[] f22195w;

    /* renamed from: x, reason: collision with root package name */
    public Iterator[] f22196x;

    /* renamed from: y, reason: collision with root package name */
    public int[] f22197y;

    /* renamed from: z, reason: collision with root package name */
    public int f22198z;

    public g(Object obj, List list) {
        k71.k.g(list, "pathRoot");
        this.f22190r = obj;
        this.f22191s = list;
        this.f22194v = new Object[64];
        this.f22195w = new Map[64];
        this.f22196x = new Iterator[64];
        this.f22197y = new int[64];
        this.f22192t = m(obj);
        this.f22193u = obj;
    }

    public static d m(Object obj) {
        if (obj == null) {
            return d.A;
        }
        if (obj instanceof List) {
            return d.f22181r;
        }
        if (obj instanceof Map) {
            return d.f22183t;
        }
        if (obj instanceof Integer) {
            return d.f22187x;
        }
        if (obj instanceof Long) {
            return d.f22188y;
        }
        if (!(obj instanceof Double) && !(obj instanceof c)) {
            return obj instanceof String ? d.f22186w : obj instanceof Boolean ? d.f22189z : d.C;
        }
        return d.f22187x;
    }

    @Override // ea.e
    public final void B() {
        f();
    }

    @Override // ea.e
    public final String c0() {
        if (this.f22192t != d.f22185v) {
            throw new JsonDataException("Expected NAME but was " + this.f22192t + " at path " + r());
        }
        Object obj = this.f22193u;
        k71.k.e(obj, "null cannot be cast to non-null type kotlin.collections.Map.Entry<kotlin.String, kotlin.Any?>");
        Map.Entry entry = (Map.Entry) obj;
        this.f22194v[this.f22198z - 1] = entry.getKey();
        this.f22193u = entry.getValue();
        this.f22192t = m(entry.getValue());
        return (String) entry.getKey();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // ea.e
    public final e e() {
        int i = this.f22198z - 1;
        this.f22198z = i;
        this.f22196x[i] = null;
        this.f22194v[i] = null;
        this.f22195w[i] = null;
        f();
        return this;
    }

    public final void f() {
        int i = this.f22198z;
        if (i == 0) {
            this.f22192t = d.B;
            return;
        }
        Iterator it = this.f22196x[i - 1];
        k71.k.d(it);
        Object[] objArr = this.f22194v;
        int i10 = this.f22198z - 1;
        Object obj = objArr[i10];
        if (obj instanceof Integer) {
            k71.k.e(obj, "null cannot be cast to non-null type kotlin.Int");
            objArr[i10] = Integer.valueOf(((Integer) obj).intValue() + 1);
        }
        if (!it.hasNext()) {
            this.f22192t = this.f22194v[this.f22198z + (-1)] instanceof Integer ? d.f22182s : d.f22184u;
            return;
        }
        Object next = it.next();
        this.f22193u = next;
        this.f22192t = next instanceof Map.Entry ? d.f22185v : m(next);
    }

    @Override // ea.e
    public final void g0() {
        if (this.f22192t == d.A) {
            f();
            return;
        }
        throw new JsonDataException("Expected NULL but was " + this.f22192t + " at path " + r());
    }

    @Override // ea.e
    public final ArrayList h() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f22191s);
        int i = this.f22198z;
        for (int i10 = 0; i10 < i; i10++) {
            Object obj = this.f22194v[i10];
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // ea.e
    public final boolean hasNext() {
        int ordinal = this.f22192t.ordinal();
        return (ordinal == 1 || ordinal == 3) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ea.e
    public final e j() {
        if (this.f22192t != d.f22183t) {
            throw new JsonDataException("Expected BEGIN_OBJECT but was " + this.f22192t + " at path " + r());
        }
        t();
        Map[] mapArr = this.f22195w;
        int i = this.f22198z - 1;
        Object obj = this.f22193u;
        k71.k.e(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
        mapArr[i] = obj;
        s0();
        return this;
    }

    @Override // ea.e
    public final e k() {
        if (this.f22192t != d.f22182s) {
            throw new JsonDataException("Expected END_ARRAY but was " + this.f22192t + " at path " + r());
        }
        int i = this.f22198z - 1;
        this.f22198z = i;
        this.f22196x[i] = null;
        this.f22194v[i] = null;
        f();
        return this;
    }

    @Override // ea.e
    public final e n() {
        if (this.f22192t != d.f22181r) {
            throw new JsonDataException("Expected BEGIN_ARRAY but was " + this.f22192t + " at path " + r());
        }
        Object obj = this.f22193u;
        k71.k.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        t();
        this.f22194v[this.f22198z - 1] = -1;
        this.f22196x[this.f22198z - 1] = ((List) obj).iterator();
        f();
        return this;
    }

    @Override // ea.e
    public final boolean nextBoolean() {
        if (this.f22192t == d.f22189z) {
            Object obj = this.f22193u;
            k71.k.e(obj, "null cannot be cast to non-null type kotlin.Boolean");
            f();
            return ((Boolean) obj).booleanValue();
        }
        throw new JsonDataException("Expected BOOLEAN but was " + this.f22192t + " at path " + r());
    }

    @Override // ea.e
    public final double nextDouble() {
        double parseDouble;
        int ordinal = this.f22192t.ordinal();
        if (ordinal != 5 && ordinal != 6 && ordinal != 7) {
            throw new JsonDataException("Expected a Double but was " + this.f22192t + " at path " + r());
        }
        Object obj = this.f22193u;
        if (obj instanceof Integer) {
            parseDouble = ((Number) obj).intValue();
        } else if (obj instanceof Long) {
            long longValue = ((Number) obj).longValue();
            double d10 = longValue;
            if (((long) d10) != longValue) {
                throw new IllegalStateException((longValue + " cannot be converted to Double").toString());
            }
            parseDouble = d10;
        } else if (obj instanceof Double) {
            parseDouble = ((Number) obj).doubleValue();
        } else if (obj instanceof String) {
            parseDouble = Double.parseDouble((String) obj);
        } else {
            if (!(obj instanceof c)) {
                throw new IllegalStateException(("Expected a Double but got " + obj + " instead").toString());
            }
            parseDouble = Double.parseDouble(((c) obj).f22180a);
        }
        f();
        return parseDouble;
    }

    @Override // ea.e
    public final int nextInt() {
        int parseInt;
        int i;
        int ordinal = this.f22192t.ordinal();
        if (ordinal != 5 && ordinal != 6 && ordinal != 7) {
            throw new JsonDataException("Expected an Int but was " + this.f22192t + " at path " + r());
        }
        Object obj = this.f22193u;
        if (obj instanceof Integer) {
            parseInt = ((Number) obj).intValue();
        } else {
            if (obj instanceof Long) {
                long longValue = ((Number) obj).longValue();
                i = (int) longValue;
                if (i != longValue) {
                    throw new IllegalStateException((longValue + " cannot be converted to Int").toString());
                }
            } else if (obj instanceof Double) {
                double doubleValue = ((Number) obj).doubleValue();
                i = (int) doubleValue;
                if (i != doubleValue) {
                    throw new IllegalStateException((doubleValue + " cannot be converted to Int").toString());
                }
            } else if (obj instanceof String) {
                parseInt = Integer.parseInt((String) obj);
            } else {
                if (!(obj instanceof c)) {
                    throw new IllegalStateException(("Expected an Int but got " + obj + " instead").toString());
                }
                parseInt = Integer.parseInt(((c) obj).f22180a);
            }
            parseInt = i;
        }
        f();
        return parseInt;
    }

    @Override // ea.e
    public final long nextLong() {
        long parseLong;
        int ordinal = this.f22192t.ordinal();
        if (ordinal != 5 && ordinal != 6 && ordinal != 7) {
            throw new JsonDataException("Expected a Long but was " + this.f22192t + " at path " + r());
        }
        Object obj = this.f22193u;
        if (obj instanceof Integer) {
            parseLong = ((Number) obj).intValue();
        } else if (obj instanceof Long) {
            parseLong = ((Number) obj).longValue();
        } else if (obj instanceof Double) {
            double doubleValue = ((Number) obj).doubleValue();
            long j10 = (long) doubleValue;
            if (j10 != doubleValue) {
                throw new IllegalStateException((doubleValue + " cannot be converted to Long").toString());
            }
            parseLong = j10;
        } else if (obj instanceof String) {
            parseLong = Long.parseLong((String) obj);
        } else {
            if (!(obj instanceof c)) {
                throw new IllegalStateException(("Expected Int but got " + obj + " instead").toString());
            }
            parseLong = Long.parseLong(((c) obj).f22180a);
        }
        f();
        return parseLong;
    }

    @Override // ea.e
    public final d peek() {
        return this.f22192t;
    }

    @Override // ea.e
    public final c q0() {
        c cVar;
        int ordinal = this.f22192t.ordinal();
        if (ordinal != 5 && ordinal != 6 && ordinal != 7) {
            throw new JsonDataException("Expected a Number but was " + this.f22192t + " at path " + r());
        }
        Object obj = this.f22193u;
        if ((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Double)) {
            cVar = new c(obj.toString());
        } else if (obj instanceof String) {
            cVar = new c((String) obj);
        } else {
            if (!(obj instanceof c)) {
                throw new IllegalStateException(("Expected JsonNumber but got " + obj + " instead").toString());
            }
            cVar = (c) obj;
        }
        f();
        return cVar;
    }

    public final String r() {
        return m.c0(h(), ".", (String) null, (String) null, 0, (j71.c) null, 62);
    }

    @Override // ea.e
    public final int r0(List list) {
        k71.k.g(list, "names");
        while (hasNext()) {
            String c02 = c0();
            int i = this.f22197y[this.f22198z - 1];
            if (i >= list.size() || !k71.k.b(list.get(i), c02)) {
                i = list.indexOf(c02);
                if (i != -1) {
                    this.f22197y[this.f22198z - 1] = i + 1;
                }
            } else {
                int[] iArr = this.f22197y;
                int i10 = this.f22198z - 1;
                iArr[i10] = iArr[i10] + 1;
            }
            if (i != -1) {
                return i;
            }
            f();
        }
        return -1;
    }

    @Override // ea.e
    public final void s0() {
        Map[] mapArr = this.f22195w;
        int i = this.f22198z;
        Map map = mapArr[i - 1];
        this.f22194v[i - 1] = null;
        k71.k.d(map);
        this.f22196x[i - 1] = map.entrySet().iterator();
        this.f22197y[this.f22198z - 1] = 0;
        f();
    }

    public final void t() {
        int i = this.f22198z;
        Object[] objArr = this.f22194v;
        if (i == objArr.length) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length * 2);
            k71.k.f(copyOf, "copyOf(...)");
            this.f22194v = copyOf;
            Map[] mapArr = this.f22195w;
            Object[] copyOf2 = Arrays.copyOf(mapArr, mapArr.length * 2);
            k71.k.f(copyOf2, "copyOf(...)");
            this.f22195w = (Map[]) copyOf2;
            int[] iArr = this.f22197y;
            int[] copyOf3 = Arrays.copyOf(iArr, iArr.length * 2);
            k71.k.f(copyOf3, "copyOf(...)");
            this.f22197y = copyOf3;
            Iterator[] itArr = this.f22196x;
            Object[] copyOf4 = Arrays.copyOf(itArr, itArr.length * 2);
            k71.k.f(copyOf4, "copyOf(...)");
            this.f22196x = (Iterator[]) copyOf4;
        }
        this.f22198z++;
    }

    @Override // ea.e
    public final String u() {
        String str;
        Object obj = this.f22193u;
        if (obj instanceof Integer) {
            str = String.valueOf(((Number) obj).intValue());
        } else if (obj instanceof Long) {
            str = String.valueOf(((Number) obj).longValue());
        } else if (obj instanceof Double) {
            str = String.valueOf(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            str = (String) obj;
        } else if (obj == null) {
            str = "null";
        } else {
            if (!(obj instanceof c)) {
                throw new IllegalStateException(("Expected a String but got " + obj + " instead").toString());
            }
            str = ((c) obj).f22180a;
        }
        f();
        return str;
    }

    public /* synthetic */ g(Map map) {
        this(map, r.r);
    }
}
