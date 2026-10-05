package c21;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.domain.searchandfilter.filters.data.assignee.NoAssignee;
import com.github.domain.searchandfilter.filters.data.label.NoLabel;
import com.github.service.models.response.Avatar;
import com.github.service.models.response.type.MobileAuthRequestType;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.measurement.internal.c4;
import com.google.android.gms.measurement.internal.f4;
import com.google.android.gms.measurement.internal.g4;
import com.google.android.gms.measurement.internal.h4;
import com.google.android.gms.measurement.internal.q4;
import com.google.android.gms.measurement.internal.v4;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c0 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ c0(int i) {
        this.a = i;
    }

    public static void a(g gVar, Parcel parcel, int i) {
        int Z = m7.y.Z(parcel, 20293);
        int i2 = gVar.r;
        m7.y.Y(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = gVar.s;
        m7.y.Y(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = gVar.t;
        m7.y.Y(parcel, 3, 4);
        parcel.writeInt(i4);
        m7.y.V(parcel, 4, gVar.u);
        m7.y.T(parcel, 5, gVar.v);
        m7.y.W(parcel, 6, gVar.w, i);
        m7.y.S(parcel, 7, gVar.x);
        m7.y.U(parcel, 8, gVar.y, i);
        m7.y.W(parcel, 10, gVar.z, i);
        m7.y.W(parcel, 11, gVar.A, i);
        boolean z = gVar.B;
        m7.y.Y(parcel, 12, 4);
        parcel.writeInt(z ? 1 : 0);
        int i5 = gVar.C;
        m7.y.Y(parcel, 13, 4);
        parcel.writeInt(i5);
        boolean z2 = gVar.D;
        m7.y.Y(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        m7.y.V(parcel, 15, gVar.E);
        m7.y.a0(parcel, Z);
    }

    public static void b(com.google.android.gms.measurement.internal.w wVar, Parcel parcel, int i) {
        String str = wVar.r;
        int Z = m7.y.Z(parcel, 20293);
        m7.y.V(parcel, 2, str);
        m7.y.U(parcel, 3, wVar.s, i);
        m7.y.V(parcel, 4, wVar.t);
        long j = wVar.u;
        m7.y.Y(parcel, 5, 8);
        parcel.writeLong(j);
        m7.y.a0(parcel, Z);
    }

    public static void c(q4 q4Var, Parcel parcel) {
        int i = q4Var.r;
        int Z = m7.y.Z(parcel, 20293);
        m7.y.Y(parcel, 1, 4);
        parcel.writeInt(i);
        m7.y.V(parcel, 2, q4Var.s);
        long j = q4Var.t;
        m7.y.Y(parcel, 3, 8);
        parcel.writeLong(j);
        Long l = q4Var.u;
        if (l != null) {
            m7.y.Y(parcel, 4, 8);
            parcel.writeLong(l.longValue());
        }
        m7.y.V(parcel, 6, q4Var.v);
        m7.y.V(parcel, 7, q4Var.w);
        Double d = q4Var.x;
        if (d != null) {
            m7.y.Y(parcel, 8, 8);
            parcel.writeDouble(d.doubleValue());
        }
        m7.y.a0(parcel, Z);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        switch (this.a) {
            case 0:
                int b0 = k41.b.b0(parcel);
                k kVar = null;
                int[] iArr = null;
                int[] iArr2 = null;
                boolean z3 = false;
                boolean z4 = false;
                int i = 0;
                while (parcel.dataPosition() < b0) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 1:
                            kVar = (k) k41.b.n(parcel, readInt, k.CREATOR);
                            break;
                        case 2:
                            z3 = k41.b.D(parcel, readInt);
                            break;
                        case 3:
                            z4 = k41.b.D(parcel, readInt);
                            break;
                        case 4:
                            int H = k41.b.H(parcel, readInt);
                            int dataPosition = parcel.dataPosition();
                            if (H == 0) {
                                iArr = null;
                                break;
                            } else {
                                iArr = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition + H);
                                break;
                            }
                        case 5:
                            i = k41.b.F(parcel, readInt);
                            break;
                        case 6:
                            int H2 = k41.b.H(parcel, readInt);
                            int dataPosition2 = parcel.dataPosition();
                            if (H2 == 0) {
                                iArr2 = null;
                                break;
                            } else {
                                iArr2 = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition2 + H2);
                                break;
                            }
                        default:
                            k41.b.N(parcel, readInt);
                            break;
                    }
                }
                k41.b.s(parcel, b0);
                return new f(kVar, z3, z4, iArr, i, iArr2);
            case 1:
                int b02 = k41.b.b0(parcel);
                Bundle bundle = new Bundle();
                Scope[] scopeArr = g.F;
                String str = null;
                IBinder iBinder = null;
                Account account = null;
                String str2 = null;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                boolean z5 = false;
                int i5 = 0;
                boolean z6 = false;
                z11.d[] dVarArr = g.G;
                z11.d[] dVarArr2 = dVarArr;
                while (parcel.dataPosition() < b02) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 1:
                            i2 = k41.b.F(parcel, readInt2);
                            break;
                        case 2:
                            i3 = k41.b.F(parcel, readInt2);
                            break;
                        case 3:
                            i4 = k41.b.F(parcel, readInt2);
                            break;
                        case 4:
                            str = k41.b.o(parcel, readInt2);
                            break;
                        case 5:
                            int H3 = k41.b.H(parcel, readInt2);
                            int dataPosition3 = parcel.dataPosition();
                            if (H3 == 0) {
                                iBinder = null;
                                break;
                            } else {
                                IBinder readStrongBinder = parcel.readStrongBinder();
                                parcel.setDataPosition(dataPosition3 + H3);
                                iBinder = readStrongBinder;
                                break;
                            }
                        case 6:
                            scopeArr = (Scope[]) k41.b.p(parcel, readInt2, Scope.CREATOR);
                            break;
                        case 7:
                            bundle = k41.b.m(parcel, readInt2);
                            break;
                        case '\b':
                            account = (Account) k41.b.n(parcel, readInt2, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            k41.b.N(parcel, readInt2);
                            break;
                        case '\n':
                            dVarArr = (z11.d[]) k41.b.p(parcel, readInt2, z11.d.CREATOR);
                            break;
                        case 11:
                            dVarArr2 = (z11.d[]) k41.b.p(parcel, readInt2, z11.d.CREATOR);
                            break;
                        case '\f':
                            z5 = k41.b.D(parcel, readInt2);
                            break;
                        case '\r':
                            i5 = k41.b.F(parcel, readInt2);
                            break;
                        case 14:
                            z6 = k41.b.D(parcel, readInt2);
                            break;
                        case 15:
                            str2 = k41.b.o(parcel, readInt2);
                            break;
                    }
                }
                k41.b.s(parcel, b02);
                return new g(i2, i3, i4, str, iBinder, scopeArr, bundle, account, dVarArr, dVarArr2, z5, i5, z6, str2);
            case 2:
                int b03 = k41.b.b0(parcel);
                long j = 0;
                long j2 = 0;
                int i6 = 0;
                while (parcel.dataPosition() < b03) {
                    int readInt3 = parcel.readInt();
                    char c = (char) readInt3;
                    if (c == 1) {
                        j = k41.b.G(parcel, readInt3);
                    } else if (c == 2) {
                        i6 = k41.b.F(parcel, readInt3);
                    } else if (c != 3) {
                        k41.b.N(parcel, readInt3);
                    } else {
                        j2 = k41.b.G(parcel, readInt3);
                    }
                }
                k41.b.s(parcel, b03);
                return new com.google.android.gms.measurement.internal.e(i6, j, j2);
            case 3:
                int b04 = k41.b.b0(parcel);
                String str3 = null;
                String str4 = null;
                q4 q4Var = null;
                String str5 = null;
                com.google.android.gms.measurement.internal.w wVar = null;
                com.google.android.gms.measurement.internal.w wVar2 = null;
                com.google.android.gms.measurement.internal.w wVar3 = null;
                long j3 = 0;
                long j4 = 0;
                long j5 = 0;
                boolean z7 = false;
                while (parcel.dataPosition() < b04) {
                    int readInt4 = parcel.readInt();
                    switch ((char) readInt4) {
                        case 2:
                            str3 = k41.b.o(parcel, readInt4);
                            break;
                        case 3:
                            str4 = k41.b.o(parcel, readInt4);
                            break;
                        case 4:
                            q4Var = (q4) k41.b.n(parcel, readInt4, q4.CREATOR);
                            break;
                        case 5:
                            j3 = k41.b.G(parcel, readInt4);
                            break;
                        case 6:
                            z7 = k41.b.D(parcel, readInt4);
                            break;
                        case 7:
                            str5 = k41.b.o(parcel, readInt4);
                            break;
                        case '\b':
                            wVar = (com.google.android.gms.measurement.internal.w) k41.b.n(parcel, readInt4, com.google.android.gms.measurement.internal.w.CREATOR);
                            break;
                        case '\t':
                            j4 = k41.b.G(parcel, readInt4);
                            break;
                        case '\n':
                            wVar2 = (com.google.android.gms.measurement.internal.w) k41.b.n(parcel, readInt4, com.google.android.gms.measurement.internal.w.CREATOR);
                            break;
                        case 11:
                            j5 = k41.b.G(parcel, readInt4);
                            break;
                        case '\f':
                            wVar3 = (com.google.android.gms.measurement.internal.w) k41.b.n(parcel, readInt4, com.google.android.gms.measurement.internal.w.CREATOR);
                            break;
                        default:
                            k41.b.N(parcel, readInt4);
                            break;
                    }
                }
                k41.b.s(parcel, b04);
                return new com.google.android.gms.measurement.internal.f(str3, str4, q4Var, j3, z7, str5, wVar, j4, wVar2, j5, wVar3);
            case 4:
                int b05 = k41.b.b0(parcel);
                Bundle bundle2 = null;
                while (parcel.dataPosition() < b05) {
                    int readInt5 = parcel.readInt();
                    if (((char) readInt5) != 1) {
                        k41.b.N(parcel, readInt5);
                    } else {
                        bundle2 = k41.b.m(parcel, readInt5);
                    }
                }
                k41.b.s(parcel, b05);
                return new com.google.android.gms.measurement.internal.j(bundle2);
            case 5:
                int b06 = k41.b.b0(parcel);
                Bundle bundle3 = null;
                while (parcel.dataPosition() < b06) {
                    int readInt6 = parcel.readInt();
                    if (((char) readInt6) != 2) {
                        k41.b.N(parcel, readInt6);
                    } else {
                        bundle3 = k41.b.m(parcel, readInt6);
                    }
                }
                k41.b.s(parcel, b06);
                return new com.google.android.gms.measurement.internal.v(bundle3);
            case 6:
                int b07 = k41.b.b0(parcel);
                long j6 = 0;
                String str6 = null;
                com.google.android.gms.measurement.internal.v vVar = null;
                String str7 = null;
                while (parcel.dataPosition() < b07) {
                    int readInt7 = parcel.readInt();
                    char c2 = (char) readInt7;
                    if (c2 == 2) {
                        str6 = k41.b.o(parcel, readInt7);
                    } else if (c2 == 3) {
                        vVar = (com.google.android.gms.measurement.internal.v) k41.b.n(parcel, readInt7, com.google.android.gms.measurement.internal.v.CREATOR);
                    } else if (c2 == 4) {
                        str7 = k41.b.o(parcel, readInt7);
                    } else if (c2 != 5) {
                        k41.b.N(parcel, readInt7);
                    } else {
                        j6 = k41.b.G(parcel, readInt7);
                    }
                }
                k41.b.s(parcel, b07);
                return new com.google.android.gms.measurement.internal.w(str6, vVar, str7, j6);
            case 7:
                int b08 = k41.b.b0(parcel);
                int i7 = 0;
                long j7 = 0;
                String str8 = null;
                while (parcel.dataPosition() < b08) {
                    int readInt8 = parcel.readInt();
                    char c3 = (char) readInt8;
                    if (c3 == 1) {
                        str8 = k41.b.o(parcel, readInt8);
                    } else if (c3 == 2) {
                        j7 = k41.b.G(parcel, readInt8);
                    } else if (c3 != 3) {
                        k41.b.N(parcel, readInt8);
                    } else {
                        i7 = k41.b.F(parcel, readInt8);
                    }
                }
                k41.b.s(parcel, b08);
                return new c4(i7, j7, str8);
            case 8:
                int b09 = k41.b.b0(parcel);
                byte[] bArr = null;
                String str9 = null;
                Bundle bundle4 = null;
                String str10 = null;
                long j8 = 0;
                long j9 = 0;
                int i8 = 0;
                while (parcel.dataPosition() < b09) {
                    int readInt9 = parcel.readInt();
                    switch ((char) readInt9) {
                        case 1:
                            j8 = k41.b.G(parcel, readInt9);
                            break;
                        case 2:
                            int H4 = k41.b.H(parcel, readInt9);
                            int dataPosition4 = parcel.dataPosition();
                            if (H4 == 0) {
                                bArr = null;
                                break;
                            } else {
                                byte[] createByteArray = parcel.createByteArray();
                                parcel.setDataPosition(dataPosition4 + H4);
                                bArr = createByteArray;
                                break;
                            }
                        case 3:
                            str9 = k41.b.o(parcel, readInt9);
                            break;
                        case 4:
                            bundle4 = k41.b.m(parcel, readInt9);
                            break;
                        case 5:
                            i8 = k41.b.F(parcel, readInt9);
                            break;
                        case 6:
                            j9 = k41.b.G(parcel, readInt9);
                            break;
                        case 7:
                            str10 = k41.b.o(parcel, readInt9);
                            break;
                        default:
                            k41.b.N(parcel, readInt9);
                            break;
                    }
                }
                k41.b.s(parcel, b09);
                return new f4(j8, bArr, str9, bundle4, i8, j9, str10);
            case 9:
                int b010 = k41.b.b0(parcel);
                while (true) {
                    ArrayList arrayList = null;
                    while (parcel.dataPosition() < b010) {
                        int readInt10 = parcel.readInt();
                        if (((char) readInt10) != 1) {
                            k41.b.N(parcel, readInt10);
                        } else {
                            int H5 = k41.b.H(parcel, readInt10);
                            int dataPosition5 = parcel.dataPosition();
                            if (H5 == 0) {
                                break;
                            }
                            ArrayList arrayList2 = new ArrayList();
                            int readInt11 = parcel.readInt();
                            for (int i9 = 0; i9 < readInt11; i9++) {
                                arrayList2.add(Integer.valueOf(parcel.readInt()));
                            }
                            parcel.setDataPosition(dataPosition5 + H5);
                            arrayList = arrayList2;
                        }
                    }
                    k41.b.s(parcel, b010);
                    return new g4(arrayList);
                    break;
                }
            case 10:
                int b011 = k41.b.b0(parcel);
                ArrayList arrayList3 = null;
                while (parcel.dataPosition() < b011) {
                    int readInt12 = parcel.readInt();
                    if (((char) readInt12) != 1) {
                        k41.b.N(parcel, readInt12);
                    } else {
                        arrayList3 = k41.b.q(parcel, readInt12, f4.CREATOR);
                    }
                }
                k41.b.s(parcel, b011);
                return new h4(arrayList3);
            case 11:
                int b012 = k41.b.b0(parcel);
                String str11 = null;
                Long l = null;
                Float f = null;
                String str12 = null;
                String str13 = null;
                Double d = null;
                long j10 = 0;
                int i10 = 0;
                while (parcel.dataPosition() < b012) {
                    int readInt13 = parcel.readInt();
                    switch ((char) readInt13) {
                        case 1:
                            i10 = k41.b.F(parcel, readInt13);
                            break;
                        case 2:
                            str11 = k41.b.o(parcel, readInt13);
                            break;
                        case 3:
                            j10 = k41.b.G(parcel, readInt13);
                            break;
                        case 4:
                            int H6 = k41.b.H(parcel, readInt13);
                            if (H6 == 0) {
                                l = null;
                                break;
                            } else {
                                k41.b.h0(parcel, H6, 8);
                                l = Long.valueOf(parcel.readLong());
                                break;
                            }
                        case 5:
                            int H7 = k41.b.H(parcel, readInt13);
                            if (H7 == 0) {
                                f = null;
                                break;
                            } else {
                                k41.b.h0(parcel, H7, 4);
                                f = Float.valueOf(parcel.readFloat());
                                break;
                            }
                        case 6:
                            str12 = k41.b.o(parcel, readInt13);
                            break;
                        case 7:
                            str13 = k41.b.o(parcel, readInt13);
                            break;
                        case '\b':
                            int H8 = k41.b.H(parcel, readInt13);
                            if (H8 == 0) {
                                d = null;
                                break;
                            } else {
                                k41.b.h0(parcel, H8, 8);
                                d = Double.valueOf(parcel.readDouble());
                                break;
                            }
                        default:
                            k41.b.N(parcel, readInt13);
                            break;
                    }
                }
                k41.b.s(parcel, b012);
                return new q4(i10, str11, j10, l, f, str12, str13, d);
            case 12:
                int b013 = k41.b.b0(parcel);
                boolean z8 = false;
                int i12 = 0;
                boolean z9 = false;
                boolean z10 = false;
                int i13 = 0;
                int i14 = 0;
                long j12 = 0;
                long j13 = 0;
                long j14 = 0;
                long j15 = 0;
                long j16 = 0;
                long j17 = 0;
                long j18 = 0;
                String str14 = "";
                String str15 = str14;
                String str16 = str15;
                String str17 = str16;
                String str18 = null;
                String str19 = null;
                String str20 = null;
                String str21 = null;
                String str22 = null;
                String str23 = null;
                Boolean bool = null;
                ArrayList<String> arrayList4 = null;
                String str24 = null;
                String str25 = null;
                int i15 = 100;
                boolean z12 = true;
                boolean z13 = true;
                long j19 = -2147483648L;
                while (parcel.dataPosition() < b013) {
                    int readInt14 = parcel.readInt();
                    switch ((char) readInt14) {
                        case 2:
                            str18 = k41.b.o(parcel, readInt14);
                            break;
                        case 3:
                            str19 = k41.b.o(parcel, readInt14);
                            break;
                        case 4:
                            str20 = k41.b.o(parcel, readInt14);
                            break;
                        case 5:
                            str21 = k41.b.o(parcel, readInt14);
                            break;
                        case 6:
                            j12 = k41.b.G(parcel, readInt14);
                            break;
                        case 7:
                            j13 = k41.b.G(parcel, readInt14);
                            break;
                        case '\b':
                            str22 = k41.b.o(parcel, readInt14);
                            break;
                        case '\t':
                            z12 = k41.b.D(parcel, readInt14);
                            break;
                        case '\n':
                            z8 = k41.b.D(parcel, readInt14);
                            break;
                        case 11:
                            j19 = k41.b.G(parcel, readInt14);
                            break;
                        case '\f':
                            str23 = k41.b.o(parcel, readInt14);
                            break;
                        case '\r':
                        case 17:
                        case 19:
                        case 20:
                        case 24:
                        case '!':
                        default:
                            k41.b.N(parcel, readInt14);
                            break;
                        case 14:
                            j14 = k41.b.G(parcel, readInt14);
                            break;
                        case 15:
                            i12 = k41.b.F(parcel, readInt14);
                            break;
                        case 16:
                            z13 = k41.b.D(parcel, readInt14);
                            break;
                        case 18:
                            z9 = k41.b.D(parcel, readInt14);
                            break;
                        case 21:
                            int H9 = k41.b.H(parcel, readInt14);
                            if (H9 == 0) {
                                bool = null;
                                break;
                            } else {
                                k41.b.h0(parcel, H9, 4);
                                bool = Boolean.valueOf(parcel.readInt() != 0);
                                break;
                            }
                        case 22:
                            j15 = k41.b.G(parcel, readInt14);
                            break;
                        case 23:
                            int H10 = k41.b.H(parcel, readInt14);
                            int dataPosition6 = parcel.dataPosition();
                            if (H10 == 0) {
                                arrayList4 = null;
                                break;
                            } else {
                                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                                parcel.setDataPosition(dataPosition6 + H10);
                                arrayList4 = createStringArrayList;
                                break;
                            }
                        case 25:
                            str14 = k41.b.o(parcel, readInt14);
                            break;
                        case 26:
                            str15 = k41.b.o(parcel, readInt14);
                            break;
                        case 27:
                            str24 = k41.b.o(parcel, readInt14);
                            break;
                        case 28:
                            z10 = k41.b.D(parcel, readInt14);
                            break;
                        case 29:
                            j16 = k41.b.G(parcel, readInt14);
                            break;
                        case 30:
                            i15 = k41.b.F(parcel, readInt14);
                            break;
                        case 31:
                            str16 = k41.b.o(parcel, readInt14);
                            break;
                        case ' ':
                            i13 = k41.b.F(parcel, readInt14);
                            break;
                        case '\"':
                            j17 = k41.b.G(parcel, readInt14);
                            break;
                        case '#':
                            str25 = k41.b.o(parcel, readInt14);
                            break;
                        case '$':
                            str17 = k41.b.o(parcel, readInt14);
                            break;
                        case '%':
                            j18 = k41.b.G(parcel, readInt14);
                            break;
                        case '&':
                            i14 = k41.b.F(parcel, readInt14);
                            break;
                    }
                }
                k41.b.s(parcel, b013);
                return new v4(str18, str19, str20, str21, j12, j13, str22, z12, z8, j19, str23, j14, i12, z13, z9, bool, j15, arrayList4, str14, str15, str24, z10, j16, i15, str16, i13, j17, str25, str17, j18, i14);
            case 13:
                return new com.google.android.material.datepicker.b((com.google.android.material.datepicker.m) parcel.readParcelable(com.google.android.material.datepicker.m.class.getClassLoader()), (com.google.android.material.datepicker.m) parcel.readParcelable(com.google.android.material.datepicker.m.class.getClassLoader()), (com.google.android.material.datepicker.d) parcel.readParcelable(com.google.android.material.datepicker.d.class.getClassLoader()), (com.google.android.material.datepicker.m) parcel.readParcelable(com.google.android.material.datepicker.m.class.getClassLoader()), parcel.readInt());
            case 14:
                return new com.google.android.material.datepicker.d(parcel.readLong());
            case 15:
                return com.google.android.material.datepicker.m.c(parcel.readInt(), parcel.readInt());
            case 16:
                k71.k.g(parcel, "parcel");
                parcel.readInt();
                return new NoAssignee();
            case 17:
                k71.k.g(parcel, "parcel");
                String readString = parcel.readString();
                Avatar avatar = (Avatar) parcel.readParcelable(dm.a.class.getClassLoader());
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                boolean z14 = false;
                boolean z15 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z14 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z15 = z;
                }
                if (parcel.readInt() == 0) {
                    z2 = z;
                }
                return new dm.a(readString, avatar, readString2, readString3, z14, z15, z2);
            case 18:
                k71.k.g(parcel, "parcel");
                return new dm.b(parcel.readString());
            case 19:
                return new e7.c(parcel);
            case 20:
                return new e7.e(parcel);
            case 21:
                return new e7.g(parcel);
            case 22:
                return new e7.i(parcel);
            case 23:
                return new e7.p(parcel);
            case 24:
                return new e7.z(parcel);
            case 25:
                return new e7.a0(parcel);
            case 26:
                k71.k.g(parcel, "parcel");
                parcel.readInt();
                return new NoLabel();
            case 27:
                k71.k.g(parcel, "parcel");
                return new em.a(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
            case 28:
                k71.k.g(parcel, "parcel");
                return new f11.b(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, MobileAuthRequestType.valueOf(parcel.readString()));
            default:
                f5.f fVar = new f5.f(parcel);
                fVar.r = parcel.readInt();
                return fVar;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new f[i];
            case 1:
                return new g[i];
            case 2:
                return new com.google.android.gms.measurement.internal.e[i];
            case 3:
                return new com.google.android.gms.measurement.internal.f[i];
            case 4:
                return new com.google.android.gms.measurement.internal.j[i];
            case 5:
                return new com.google.android.gms.measurement.internal.v[i];
            case 6:
                return new com.google.android.gms.measurement.internal.w[i];
            case 7:
                return new c4[i];
            case 8:
                return new f4[i];
            case 9:
                return new g4[i];
            case 10:
                return new h4[i];
            case 11:
                return new q4[i];
            case 12:
                return new v4[i];
            case 13:
                return new com.google.android.material.datepicker.b[i];
            case 14:
                return new com.google.android.material.datepicker.d[i];
            case 15:
                return new com.google.android.material.datepicker.m[i];
            case 16:
                return new NoAssignee[i];
            case 17:
                return new dm.a[i];
            case 18:
                return new dm.b[i];
            case 19:
                return new e7.c[i];
            case 20:
                return new e7.e[i];
            case 21:
                return new e7.g[i];
            case 22:
                return new e7.i[i];
            case 23:
                return new e7.p[i];
            case 24:
                return new e7.z[i];
            case 25:
                return new e7.a0[i];
            case 26:
                return new NoLabel[i];
            case 27:
                return new em.a[i];
            case 28:
                return new f11.b[i];
            default:
                return new f5.f[i];
        }
    }
}
