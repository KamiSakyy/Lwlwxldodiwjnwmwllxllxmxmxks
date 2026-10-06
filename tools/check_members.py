#!/usr/bin/env python3
"""Грубая проверка ссылок на свои методы/поля: ловит опечатки и забытые методы."""
import glob, re, sys, os, collections

JAVA = glob.glob('app/src/main/java/**/*.java', recursive=True)

KNOWN_INHERITED = set("""
setContentView findViewById getString getResources getSystemService getIntent getPackageManager
startActivity startActivityForResult finish finishAfterTransition setResult setTitle getLayoutInflater
onCreate onResume onPause onDestroy onStart onStop onSaveInstanceState onBackPressed onActivityResult
onRequestPermissionsResult requestPermissions checkSelfPermission onNewIntent onConfigurationChanged
runOnUiThread getApplicationContext getCacheDir getFilesDir getExternalFilesDir getContentResolver
setTheme getTheme getWindow getSupportFragmentManager getLayoutManager getItemCount getItemViewType
notifyDataSetChanged notifyItemChanged notifyItemInserted notifyItemRemoved post postDelayed removeCallbacks
getContext getApplication startService stopService bindService moveTaskToBack isFinishing getMainLooper
onBind onStartCommand onTaskRemoved addListener removeListener toString equals hashCode getClass
setOnClickListener setOnLongClickListener setOnTouchListener setVisibility setAlpha setTranslationX
setTranslationY setTranslationZ setScaleX setScaleY setRotation setPivotX setPivotY animate
getLayoutParams setLayoutParams requestLayout invalidate postInvalidateOnAnimation
setBackgroundResource setBackgroundColor setBackground setText setTextSize setTextColor setTypeface
setPadding setTag getTag setEnabled isEnabled setSelected isSelected setAlpha
wrap setContentView2 addView removeAllViews removeView getChildCount getChildAt setGravity setMargins
setWeightSum setOrientation setImageView getDrawable setImageDrawable setImageResource setImageBitmap
setImageTintList setColorFilter setAdjustViewBounds setScaleType setMaxLines setEllipsize setHint
setFilters setSelection append getText setInputType setImeOptions setOnEditorActionListener
addTextChangedListener beforeTextChanged onTextChanged afterTextChanged setChecked isChecked
setOnCheckedChangeListener setTitle setMessage setPositiveButton setNegativeButton setNeutralButton
setView setItems setCancelable setSingleChoiceItems show dismiss setInterpolator setDuration
setStartDelay setRepeatCount setRepeatMode setFillAfter startAnimation clearAnimation cancel
setListener setUpdateListener setTarget setTargetObject setValue setStartValue setStartVelocity
setMinimumVisibleChange setSpring setDampingRatio setStiffness setStiffness2
setDecorFitsSystemWindows setSystemUiVisibility setStatusBarColor setNavigationBarColor
getInsetsController setOnApplyWindowInsetsListener setOnScrollChangeListener setOnTouchListener2
setHasFixedSize setItemAnimator setItemDecoration setAdapter setLayoutManager setStackFromEnd
scrollToPosition scrollToPositionWithOffset smoothScrollToPosition findLastVisibleItemPosition
findFirstVisibleItemPosition findViewByPosition findViewHolderForAdapterPosition itemView
setTransitionName getTransitionName setEnterTransition setExitTransition
makeSceneTransitionAnimation toBundle putExtra getStringExtra getLongExtra getBooleanExtra
setResult2 getData getAction getActionMasked getRawX getRawY getX getY getPointerCount
getHistorySize getEventTime getDownTime getPointerId findPointerIndex getPressure getSize
setPressed setActivated setActivated2 requestDisallowInterceptTouchEvent performHapticFeedback
startDragAndDrop setOnDragListener start text replace split trim substring indexOf lastIndexOf
charAt length isEmpty contains startsWith endsWith matches toLowerCase toUpperCase format valueOf
append deleteCharAt setLength insert getBytes equalsIgnoreCase replaceAll trim2
add put remove clear size get optString optInt optLong optBoolean optJSONObject optJSONArray keys
has next nextInt hasNextInt hasNext optDouble put2 remove2 length2
encodeToString decode encode decodeByteArray decodeFile compress recycle getWidth getHeight
getByteCount getConfig copy createBitmap createScaledBitmap createBitmap2
generateKeyPair generateSecret init doPhase getInstance getKey getCertificate containsAlias
deleteEntry load store getEncoded getFormat getAlgorithm getPublic getPrivate getAffineX getAffineY
toByteArray write read close flush toString2 getAbsolutePath exists delete mkdirs listFiles lastModified
renameTo getParentFile getName getPath getCanonicalPath isDirectory isFile length getName2
values() keySet entrySet iterator addAll clear2 containsKey getOrDefault putAll removeIf
now random UUID currentTimeMillis nanoTime format2
""".split())

ANDROID_PREFIX_HINTS = ("set", "get", "on", "is", "has", "add", "remove", "make", "request", "perform",
                        "find", "create", "start", "stop", "notify", "invalidate", "animate", "post",
                        "register", "unregister", "show", "hide", "apply", "clear", "update", "copy",
                        "open", "close", "read", "write", "send", "bind", "attach", "detach", "enable",
                        "disable", "cancel", "finish", "scroll", "smooth", "attach", "compute", "resolve",
                        "encode", "decode", "check", "parse", "format", "load", "save", "put", "opt")

def defined_members(path):
    t = open(path, encoding='utf-8').read()
    names = set(re.findall(r'\b(?:public|protected|private|static|final|synchronized|abstract|native)\s+[\w<>\[\],.?\s]*?\b(\w+)\s*\(', t))
    names |= set(re.findall(r'\b(?:public|protected|private|static|final)\s+[\w<>\[\],.?\s]*?\b(\w+)\s*[=;]', t))
    return names

problems = []
for f in JAVA:
    text = open(f, encoding='utf-8').read()
    own = defined_members(f)
    # методы интерфейсов, объявленных в этом же файле
    for m in re.finditer(r'\b[A-Z]\w+\.(\w+)\s*\(', text):
        pass
    for m in re.finditer(r'(?<![\w.])([a-z]\w{2,})\s*\(', text):
        name = m.group(1)
        if name in own or name in KNOWN_INHERITED:
            continue
        if name in ('if', 'for', 'while', 'switch', 'catch', 'try', 'return', 'new', 'super', 'this', 'synchronized', 'throw'):
            continue
        if name.startswith(ANDROID_PREFIX_HINTS):
            continue
        if re.search(r'\b(?:class|interface|enum)\s+' + name + r'\b', text):
            continue
        line = text[:m.start()].count('\n') + 1
        problems.append((f, line, name))

for f, line, name in problems:
    print('ПРОВЕРИТЬ %s:%d — %s(' % (f, line, name))
print('подозрительных вызовов:', len(problems))
