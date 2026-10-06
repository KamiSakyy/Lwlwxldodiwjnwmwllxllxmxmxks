package qj;

import android.content.Context;
import android.content.SharedPreferences;
import ck.h;
import java.io.File;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c extends p7.a {
    public final /* synthetic */ int c;
    public final Context d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, int i) {
        super(3, 4);
        this.c = i;
        switch (i) {
            case 2:
                super(9, 10);
                this.d = context;
                break;
            default:
                this.d = context;
                break;
        }
    }

    public final void b(w7.a aVar) {
        switch (this.c) {
            case 0:
                k.g(aVar, "db");
                h.Companion.getClass();
                aVar.x("CREATE TABLE IF NOT EXISTS recent_searches (\n    query TEXT NOT NULL PRIMARY KEY,\n    performed_at INTEGER NOT NULL\n)");
                new File(this.d.getFilesDir(), "recent-searches.txt").delete();
                return;
            case 1:
                k.g(aVar, "db");
                if (((p7.a) this).b >= 10) {
                    aVar.S(new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    this.d.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                k.g(aVar, "db");
                aVar.x("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                Context context = this.d;
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    long j2 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                    aVar.o();
                    try {
                        aVar.S(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j)});
                        aVar.S(new Object[]{"reschedule_needed", Long.valueOf(j2)});
                        sharedPreferences.edit().clear().apply();
                        aVar.T();
                    } finally {
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i2 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    aVar.o();
                    try {
                        aVar.S(new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                        aVar.S(new Object[]{"next_alarm_manager_id", Integer.valueOf(i2)});
                        sharedPreferences2.edit().clear().apply();
                        aVar.T();
                        return;
                    } finally {
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i, int i2, Context context) {
        super(i, i2);
        this.c = 1;
        this.d = context;
    }
}
