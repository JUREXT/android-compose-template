package com.monstarlab.core.data.storage

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import com.monstarlab.arch.data.SharedPreferenceDataStore
import com.monstarlab.core.domain.model.User
import javax.inject.Inject

class UserPreferenceStore @Inject constructor(
    dataStore: DataStore<Preferences>
) : SharedPreferenceDataStore<User>(dataStore, User.serializer())