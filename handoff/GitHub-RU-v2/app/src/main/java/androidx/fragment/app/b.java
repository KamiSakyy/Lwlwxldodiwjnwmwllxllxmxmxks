package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: /home/user/work/p/classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a21.g(3);
    public final int A;
    public final CharSequence B;
    public final ArrayList C;
    public final ArrayList D;
    public final boolean E;

    /* renamed from: r, reason: collision with root package name */
    public final int[] f2492r;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f2493s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f2494t;

    /* renamed from: u, reason: collision with root package name */
    public final int[] f2495u;

    /* renamed from: v, reason: collision with root package name */
    public final int f2496v;

    /* renamed from: w, reason: collision with root package name */
    public final String f2497w;

    /* renamed from: x, reason: collision with root package name */
    public final int f2498x;

    /* renamed from: y, reason: collision with root package name */
    public final int f2499y;

    /* renamed from: z, reason: collision with root package name */
    public final CharSequence f2500z;

    public b(a aVar) {
        int size = aVar.f2423c.size();
        this.f2492r = new int[size * 6];
        if (!aVar.i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f2493s = new ArrayList(size);
        this.f2494t = new int[size];
        this.f2495u = new int[size];
        int i = 0;
        for (int i10 = 0; i10 < size; i10++) {
            k1 k1Var = (k1) aVar.f2423c.get(i10);
            int i11 = i + 1;
            this.f2492r[i] = k1Var.f2587a;
            ArrayList arrayList = this.f2493s;
            a0 a0Var = k1Var.f2588b;
            arrayList.add(a0Var != null ? a0Var.f2465w : null);
            int[] iArr = this.f2492r;
            iArr[i11] = k1Var.f2589c ? 1 : 0;
            iArr[i + 2] = k1Var.f2590d;
            iArr[i + 3] = k1Var.f2591e;
            int i12 = i + 5;
            iArr[i + 4] = k1Var.f2592f;
            i += 6;
            iArr[i12] = k1Var.f2593g;
            this.f2494t[i10] = k1Var.f2594h.ordinal();
            this.f2495u[i10] = k1Var.i.ordinal();
        }
        this.f2496v = aVar.f2428h;
        this.f2497w = aVar.f2430k;
        this.f2498x = aVar.f2439v;
        this.f2499y = aVar.l;
        this.f2500z = aVar.m;
        this.A = aVar.f2431n;
        this.B = aVar.f2432o;
        this.C = aVar.f2433p;
        this.D = aVar.f2434q;
        this.E = aVar.f2435r;
    }

    public final void c(a aVar) {
        int i = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f2492r;
            boolean z10 = true;
            if (i >= iArr.length) {
                aVar.f2428h = this.f2496v;
                aVar.f2430k = this.f2497w;
                aVar.i = true;
                aVar.l = this.f2499y;
                aVar.m = this.f2500z;
                aVar.f2431n = this.A;
                aVar.f2432o = this.B;
                aVar.f2433p = this.C;
                aVar.f2434q = this.D;
                aVar.f2435r = this.E;
                return;
            }
            k1 k1Var = new k1();
            int i11 = i + 1;
            k1Var.f2587a = iArr[i];
            if (a1.O(2)) {
                Objects.toString(aVar);
                int i12 = iArr[i11];
            }
            k1Var.f2594h = androidx.lifecycle.w.values()[this.f2494t[i10]];
            k1Var.i = androidx.lifecycle.w.values()[this.f2495u[i10]];
            int i13 = i + 2;
            if (iArr[i11] == 0) {
                z10 = false;
            }
            k1Var.f2589c = z10;
            int i14 = iArr[i13];
            k1Var.f2590d = i14;
            int i15 = iArr[i + 3];
            k1Var.f2591e = i15;
            int i16 = i + 5;
            int i17 = iArr[i + 4];
            k1Var.f2592f = i17;
            i += 6;
            int i18 = iArr[i16];
            k1Var.f2593g = i18;
            aVar.f2424d = i14;
            aVar.f2425e = i15;
            aVar.f2426f = i17;
            aVar.f2427g = i18;
            aVar.c(k1Var);
            i10++;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f2492r);
        parcel.writeStringList(this.f2493s);
        parcel.writeIntArray(this.f2494t);
        parcel.writeIntArray(this.f2495u);
        parcel.writeInt(this.f2496v);
        parcel.writeString(this.f2497w);
        parcel.writeInt(this.f2498x);
        parcel.writeInt(this.f2499y);
        TextUtils.writeToParcel(this.f2500z, parcel, 0);
        parcel.writeInt(this.A);
        TextUtils.writeToParcel(this.B, parcel, 0);
        parcel.writeStringList(this.C);
        parcel.writeStringList(this.D);
        parcel.writeInt(this.E ? 1 : 0);
    }

    public b(Parcel parcel) {
        this.f2492r = parcel.createIntArray();
        this.f2493s = parcel.createStringArrayList();
        this.f2494t = parcel.createIntArray();
        this.f2495u = parcel.createIntArray();
        this.f2496v = parcel.readInt();
        this.f2497w = parcel.readString();
        this.f2498x = parcel.readInt();
        this.f2499y = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f2500z = (CharSequence) creator.createFromParcel(parcel);
        this.A = parcel.readInt();
        this.B = (CharSequence) creator.createFromParcel(parcel);
        this.C = parcel.createStringArrayList();
        this.D = parcel.createStringArrayList();
        this.E = parcel.readInt() != 0;
    }





}
