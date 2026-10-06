package e9;

import androidx.work.impl.WorkDatabase;

/* loaded from: /home/user/work/p/classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public WorkDatabase f22144a;

    public g(WorkDatabase workDatabase, int i) {
        switch (i) {
            case 1:
                this.f22144a = workDatabase;
                break;
            default:
                k71.k.g(workDatabase, "workDatabase");
                this.f22144a = workDatabase;
                break;
        }
    }
}
