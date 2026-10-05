package g5;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.viewpager.widget.h;
import com.google.android.gms.internal.measurement.a4;
import q.t2;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class a extends BaseAdapter implements Filterable {

    /* renamed from: r, reason: collision with root package name */
    public boolean f24769r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f24770s;

    /* renamed from: t, reason: collision with root package name */
    public Cursor f24771t;

    /* renamed from: u, reason: collision with root package name */
    public int f24772u;

    /* renamed from: v, reason: collision with root package name */
    public a4 f24773v;

    /* renamed from: w, reason: collision with root package name */
    public h f24774w;

    /* renamed from: x, reason: collision with root package name */
    public b f24775x;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f24771t;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                a4 a4Var = this.f24773v;
                if (a4Var != null) {
                    cursor2.unregisterContentObserver(a4Var);
                }
                h hVar = this.f24774w;
                if (hVar != null) {
                    cursor2.unregisterDataSetObserver(hVar);
                }
            }
            this.f24771t = cursor;
            if (cursor != null) {
                a4 a4Var2 = this.f24773v;
                if (a4Var2 != null) {
                    cursor.registerContentObserver(a4Var2);
                }
                h hVar2 = this.f24774w;
                if (hVar2 != null) {
                    cursor.registerDataSetObserver(hVar2);
                }
                this.f24772u = cursor.getColumnIndexOrThrow("_id");
                this.f24769r = true;
                notifyDataSetChanged();
            } else {
                this.f24772u = -1;
                this.f24769r = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    public abstract View d(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f24769r || (cursor = this.f24771t) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f24769r) {
            return null;
        }
        this.f24771t.moveToPosition(i);
        if (view == null) {
            t2 t2Var = (t2) this;
            view = t2Var.A.inflate(t2Var.f30733z, viewGroup, false);
        }
        a(view, this.f24771t);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f24775x == null) {
            b bVar = new b();
            bVar.f24776a = this;
            this.f24775x = bVar;
        }
        return this.f24775x;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Cursor cursor;
        if (!this.f24769r || (cursor = this.f24771t) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f24771t;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        Cursor cursor;
        if (this.f24769r && (cursor = this.f24771t) != null && cursor.moveToPosition(i)) {
            return this.f24771t.getLong(this.f24772u);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f24769r) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f24771t.moveToPosition(i)) {
            throw new IllegalStateException(no.a.k("couldn't move cursor to position ", i));
        }
        if (view == null) {
            view = d(viewGroup);
        }
        a(view, this.f24771t);
        return view;
    }





}
