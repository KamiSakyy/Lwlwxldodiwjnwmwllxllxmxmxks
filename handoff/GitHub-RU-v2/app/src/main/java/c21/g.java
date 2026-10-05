package c21;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.api.Scope;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g extends d21.a {
    public static final Parcelable.Creator<g> CREATOR = new c0(1);
    public static final Scope[] F = new Scope[0];
    public static final z11.d[] G = new z11.d[0];
    public z11.d[] A;
    public final boolean B;
    public final int C;
    public final boolean D;
    public final String E;
    public final int r;
    public final int s;
    public final int t;
    public String u;
    public IBinder v;
    public Scope[] w;
    public Bundle x;
    public Account y;
    public z11.d[] z;

    public g(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, z11.d[] dVarArr, z11.d[] dVarArr2, boolean z, int i4, boolean z2, String str2) {
        Scope[] scopeArr2 = scopeArr == null ? F : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        z11.d[] dVarArr3 = G;
        z11.d[] dVarArr4 = dVarArr == null ? dVarArr3 : dVarArr;
        dVarArr3 = dVarArr2 != null ? dVarArr2 : dVarArr3;
        this.r = i;
        this.s = i2;
        this.t = i3;
        if ("com.google.android.gms".equals(str)) {
            this.u = "com.google.android.gms";
        } else {
            this.u = str;
        }
        if (i < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i5 = a.g;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IInterface i0Var = queryLocalInterface instanceof h ? (h) queryLocalInterface : new i0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 2);
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    i0 i0Var2 = (i0) i0Var;
                    Parcel e = i0Var2.e(i0Var2.g(), 2);
                    Account account3 = (Account) o21.g.a(e, Account.CREATOR);
                    e.recycle();
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    account2 = account3;
                } catch (RemoteException unused) {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                } catch (Throwable th) {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    throw th;
                }
            }
            this.y = account2;
        } else {
            this.v = iBinder;
            this.y = account;
        }
        this.w = scopeArr2;
        this.x = bundle2;
        this.z = dVarArr4;
        this.A = dVarArr3;
        this.B = z;
        this.C = i4;
        this.D = z2;
        this.E = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        c0.a(this, parcel, i);
    }
}
