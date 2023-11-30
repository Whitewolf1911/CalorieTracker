package com.alibasoglu.tracker_domain.di

import com.alibasoglu.tracker_domain.repository.TrackerRepository
import com.alibasoglu.tracker_domain.use_case.CalculateMealNutrients
import com.alibasoglu.tracker_domain.use_case.DeleteTrackedFood
import com.alibasoglu.tracker_domain.use_case.GetFoodsForDate
import com.alibasoglu.tracker_domain.use_case.SearchFood
import com.alibasoglu.tracker_domain.use_case.TrackFood
import com.alibasoglu.tracker_domain.use_case.TrackerUseCases
import com.plcoding.core.domain.preferences.Preferences
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
object TrackerDomainModule {

    @ViewModelScoped
    @Provides
    fun provideTrackerUseCases(repository: TrackerRepository, preferences: Preferences): TrackerUseCases {
        return TrackerUseCases(
            trackFood = TrackFood(repository = repository),
            searchFood = SearchFood(repository = repository),
            getFoodsForDate = GetFoodsForDate(repository = repository),
            deleteTrackedFood = DeleteTrackedFood(repository = repository),
            calculateMealNutrients = CalculateMealNutrients(preferences = preferences)
        )
    }
}
