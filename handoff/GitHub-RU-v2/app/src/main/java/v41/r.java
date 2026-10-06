package v41;

import android.util.Log;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /home/user/work/p/classes4.dex */
public final class rShadow implements Thread.UncaughtExceptionHandler {
    public s21.a a;
    public d51.d b;
    public Thread.UncaughtExceptionHandler c;
    public s41.b d;
    public final AtomicBoolean e = new AtomicBoolean(false);

    public Object r(s21.a aVar, d51.d dVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, s41.b bVar) {
        this.a = aVar;
        this.b = dVar;
        this.c = uncaughtExceptionHandler;
        this.d = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void uncaughtException(Thread thread, Throwable th) {
        AtomicBoolean atomicBoolean = this.e;
        atomicBoolean.set(true);
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.c;
        if (thread != null && th != null) {
            try {
                if (!this.d.b()) {
                    this.a.r(this.b, thread, th);
                    if (uncaughtExceptionHandler == null) {
                        Log.isLoggable("FirebaseCrashlytics", 3);
                        uncaughtExceptionHandler.uncaughtException(thread, th);
                    } else {
                        Log.isLoggable("FirebaseCrashlytics", 3);
                        System.exit(1);
                    }
                    atomicBoolean.set(false);
                }
                Log.isLoggable("FirebaseCrashlytics", 3);
            } catch (Exception unused) {
                if (uncaughtExceptionHandler != null) {
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                } else {
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    System.exit(1);
                }
                atomicBoolean.set(false);
                return;
            } catch (Throwable th2) {
                if (uncaughtExceptionHandler != null) {
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                } else {
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    System.exit(1);
                }
                atomicBoolean.set(false);
                throw th2;
            }
        }
        Log.isLoggable("FirebaseCrashlytics", 3);
        if (uncaughtExceptionHandler == null) {
        }
        atomicBoolean.set(false);
    }
}
