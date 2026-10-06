package d31;

import a0.s0;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.GestureDetector;
import android.view.View;
import android.widget.RemoteViews;
import androidx.fragment.app.o;
import androidx.fragment.app.s;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import w2.o1;
import x61.m;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f {
    public final /* synthetic */ int a;
    public boolean b;
    public int c;
    public Object d;
    public Object e;

    public f(long[] jArr, RemoteViews[] remoteViewsArr) {
        this.a = 1;
        this.d = jArr;
        this.e = remoteViewsArr;
        this.b = false;
        this.c = 1;
        if (jArr.length != remoteViewsArr.length) {
            throw new IllegalArgumentException("RemoteCollectionItems has different number of ids and views");
        }
        ArrayList arrayList = new ArrayList(remoteViewsArr.length);
        for (RemoteViews remoteViews : remoteViewsArr) {
            arrayList.add(Integer.valueOf(remoteViews.getLayoutId()));
        }
        int size = m.F0(m.J0(arrayList)).size();
        if (size > 1) {
            throw new IllegalArgumentException(s0.i("View type count is set to 1, but the collection contains ", size, " different layout ids").toString());
        }
    }

    public void a(int i) {
        switch (this.a) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.e;
                WeakReference weakReference = bottomSheetBehavior.X;
                if (weakReference != null && weakReference.get() != null) {
                    this.c = i;
                    if (!this.b) {
                        ((View) bottomSheetBehavior.X.get()).postOnAnimation((o) this.d);
                        this.b = true;
                        break;
                    }
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.e;
                WeakReference weakReference2 = sideSheetBehavior.p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.c = i;
                    if (!this.b) {
                        ((View) sideSheetBehavior.p.get()).postOnAnimation((s) this.d);
                        this.b = true;
                        break;
                    }
                }
                break;
        }
    }

    public f(Parcel parcel) {
        this.a = 1;
        k71.k.g(parcel, "parcel");
        int readInt = parcel.readInt();
        long[] jArr = new long[readInt];
        this.d = jArr;
        parcel.readLongArray(jArr);
        Parcelable.Creator creator = RemoteViews.CREATOR;
        k71.k.f(creator, "CREATOR");
        RemoteViews[] remoteViewsArr = new RemoteViews[readInt];
        parcel.readTypedArray(remoteViewsArr, creator);
        for (int i = 0; i < readInt; i++) {
            if (remoteViewsArr[i] == null) {
                throw new IllegalArgumentException("null element found in " + remoteViewsArr + '.');
            }
        }
        this.e = remoteViewsArr;
        this.b = parcel.readInt() == 1;
        this.c = parcel.readInt();
    }

    public f(SideSheetBehavior sideSheetBehavior) {
        this.a = 2;
        this.e = sideSheetBehavior;
        this.d = new s(23, this);
    }

    public f(BottomSheetBehavior bottomSheetBehavior) {
        this.a = 0;
        this.e = bottomSheetBehavior;
        this.d = new o(14, this);
    }

    public f(Context context, w2.o oVar) {
        this.a = 3;
        this.d = oVar;
        this.c = 0;
        this.e = new GestureDetector(context, (GestureDetector.OnGestureListener) new o1(this));
    }
}
