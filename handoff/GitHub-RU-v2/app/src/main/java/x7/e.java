package x7;

import android.database.Cursor;
import java.util.Arrays;
import k71.k;
import sy.rShadow;

/* loaded from: /home/user/work/p/classes.dex */
public class e extends f {

    /* renamed from: u, reason: collision with root package name */
    public int[] f33944u;

    /* renamed from: v, reason: collision with root package name */
    public long[] f33945v;

    /* renamed from: w, reason: collision with root package name */
    public double[] f33946w;

    /* renamed from: x, reason: collision with root package name */
    public String[] f33947x;

    /* renamed from: y, reason: collision with root package name */
    public byte[][] f33948y;

    /* renamed from: z, reason: collision with root package name */
    public Cursor f33949z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(w7.a aVar, String str) {
        super(aVar, str);
        k.g(aVar, "db");
        k.g(str, "sql");
        this.f33944u = new int[0];
        this.f33945v = new long[0];
        this.f33946w = new double[0];
        this.f33947x = new String[0];
        this.f33948y = new byte[0][];
    }

    public static void t(Cursor cursor, int i) {
        if (i < 0 || i >= cursor.getColumnCount()) {
            rShadow.w("column index out of range", 25);
            throw null;
        }
    }

    public final Cursor A() {
        Cursor cursor = this.f33949z;
        if (cursor != null) {
            return cursor;
        }
        rShadow.w("no row", 21);
        throw null;
    }

    @Override // v7.c
    public final boolean B0() {
        f();
        r();
        Cursor cursor = this.f33949z;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // v7.c
    public final void c(int i, long j10) {
        f();
        m(1, i);
        this.f33944u[i] = 1;
        this.f33945v[i] = j10;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.f33952t) {
            l();
            reset();
        }
        this.f33952t = true;
    }

    @Override // v7.c
    public final void d(int i, byte[] bArr) {
        f();
        m(4, i);
        this.f33944u[i] = 4;
        this.f33948y[i] = bArr;
    }

    @Override // v7.c
    public final void g(int i) {
        f();
        m(5, i);
        this.f33944u[i] = 5;
    }

    @Override // v7.c
    public final byte[] getBlob(int i) {
        f();
        Cursor A = A();
        t(A, i);
        byte[] blob = A.getBlob(i);
        k.f(blob, "getBlob(...)");
        return blob;
    }

    @Override // v7.c
    public final int getColumnCount() {
        f();
        r();
        Cursor cursor = this.f33949z;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // v7.c
    public final String getColumnName(int i) {
        f();
        r();
        Cursor cursor = this.f33949z;
        if (cursor == null) {
            throw new IllegalStateException("Required value was null.");
        }
        t(cursor, i);
        String columnName = cursor.getColumnName(i);
        k.f(columnName, "getColumnName(...)");
        return columnName;
    }

    @Override // v7.c
    public final long getLong(int i) {
        f();
        Cursor A = A();
        t(A, i);
        return A.getLong(i);
    }

    @Override // v7.c
    public final boolean isNull(int i) {
        f();
        Cursor A = A();
        t(A, i);
        return A.isNull(i);
    }

    @Override // v7.c
    public final void k0(String str, int i) {
        k.g(str, "value");
        f();
        m(3, i);
        this.f33944u[i] = 3;
        this.f33947x[i] = str;
    }

    @Override // x7.f, v7.c
    public final void l() {
        f();
        this.f33944u = new int[0];
        this.f33945v = new long[0];
        this.f33946w = new double[0];
        this.f33947x = new String[0];
        this.f33948y = new byte[0][];
    }

    @Override // v7.c
    public final String l0(int i) {
        f();
        Cursor A = A();
        t(A, i);
        String string = A.getString(i);
        k.f(string, "getString(...)");
        return string;
    }

    public final void m(int i, int i10) {
        int i11 = i10 + 1;
        int[] iArr = this.f33944u;
        if (iArr.length < i11) {
            int[] copyOf = Arrays.copyOf(iArr, i11);
            k.f(copyOf, "copyOf(...)");
            this.f33944u = copyOf;
        }
        if (i == 1) {
            long[] jArr = this.f33945v;
            if (jArr.length < i11) {
                long[] copyOf2 = Arrays.copyOf(jArr, i11);
                k.f(copyOf2, "copyOf(...)");
                this.f33945v = copyOf2;
                return;
            }
            return;
        }
        if (i == 2) {
            double[] dArr = this.f33946w;
            if (dArr.length < i11) {
                double[] copyOf3 = Arrays.copyOf(dArr, i11);
                k.f(copyOf3, "copyOf(...)");
                this.f33946w = copyOf3;
                return;
            }
            return;
        }
        if (i == 3) {
            String[] strArr = this.f33947x;
            if (strArr.length < i11) {
                Object[] copyOf4 = Arrays.copyOf(strArr, i11);
                k.f(copyOf4, "copyOf(...)");
                this.f33947x = (String[]) copyOf4;
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        byte[][] bArr = this.f33948y;
        if (bArr.length < i11) {
            Object[] copyOf5 = Arrays.copyOf(bArr, i11);
            k.f(copyOf5, "copyOf(...)");
            this.f33948y = (byte[][]) copyOf5;
        }
    }

    public final void r() {
        if (this.f33949z == null) {
            this.f33949z = this.f33950r.m0(new s21.a(29, this));
        }
    }

    @Override // x7.f, v7.c
    public final void reset() {
        f();
        Cursor cursor = this.f33949z;
        if (cursor != null) {
            cursor.close();
        }
        this.f33949z = null;
    }
}
