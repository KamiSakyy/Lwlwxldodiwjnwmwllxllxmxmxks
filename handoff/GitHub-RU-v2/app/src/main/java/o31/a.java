package o31;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import b21.v;
import com.google.android.material.chip.ChipGroup;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a {
    public boolean a;
    public boolean b;
    public Object c;
    public Serializable d;
    public Object e;

    public a() {
        this.c = new HashMap();
        this.d = new HashSet();
    }

    public boolean a(i iVar) {
        int id = iVar.getId();
        HashSet hashSet = (HashSet) this.d;
        if (hashSet.contains(Integer.valueOf(id))) {
            return false;
        }
        i iVar2 = (i) ((HashMap) this.c).get(Integer.valueOf(c()));
        if (iVar2 != null) {
            e(iVar2, false);
        }
        boolean add = hashSet.add(Integer.valueOf(id));
        if (!iVar.isChecked()) {
            iVar.setChecked(true);
        }
        return add;
    }

    public ArrayList b(ViewGroup viewGroup) {
        HashSet hashSet = new HashSet((HashSet) this.d);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof i) && hashSet.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    public int c() {
        HashSet hashSet = (HashSet) this.d;
        if (!this.a || hashSet.isEmpty()) {
            return -1;
        }
        return ((Integer) hashSet.iterator().next()).intValue();
    }

    public void d() {
        i31.g gVar = (i31.g) this.e;
        if (gVar != null) {
            new HashSet((HashSet) this.d);
            ChipGroup chipGroup = gVar.a;
            i31.j jVar = chipGroup.x;
            if (jVar != null) {
                chipGroup.y.b(chipGroup);
                ChipGroup chipGroup2 = ((i31.g) jVar).a;
                if (chipGroup2.y.a) {
                    chipGroup2.getCheckedChipId();
                    throw null;
                }
            }
        }
    }

    public boolean e(i iVar, boolean z) {
        int id = iVar.getId();
        HashSet hashSet = (HashSet) this.d;
        if (!hashSet.contains(Integer.valueOf(id))) {
            return false;
        }
        if (z && hashSet.size() == 1 && hashSet.contains(Integer.valueOf(id))) {
            iVar.setChecked(true);
            return false;
        }
        boolean remove = hashSet.remove(Integer.valueOf(id));
        if (iVar.isChecked()) {
            iVar.setChecked(false);
        }
        return remove;
    }

    public a(Context context, String str, v vVar, boolean z, boolean z2) {
        k71.k.g(context, "context");
        k71.k.g(vVar, "callback");
        this.c = context;
        this.d = str;
        this.e = vVar;
        this.a = z;
        this.b = z2;
    }
}
