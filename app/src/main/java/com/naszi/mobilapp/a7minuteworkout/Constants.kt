package com.naszi.mobilapp.a7minuteworkout

object Constants {
    fun defaultExerciseList(): ArrayList<ExerciseModel> {
        val exerciseList = ArrayList<ExerciseModel>()
        val jumpingJacks = ExerciseModel(
            1,
            "Jumping Jack",
            R.drawable.ic_jumping_jacks
        )
        exerciseList.add(jumpingJacks)
        val abdominalCrunch = ExerciseModel(
            2,
            "Abdominal Crunch",
            R.drawable.ic_abdominal_crunch
        )
        exerciseList.add(abdominalCrunch)
        val heightKneeRunning = ExerciseModel(
            3,
            "Height Knee Running in Place",
            R.drawable.ic_high_knees_running_in_place
        )
        exerciseList.add(heightKneeRunning)
        val lunge = ExerciseModel(
            4,
            "Lunge",
            R.drawable.ic_lunge
        )
        exerciseList.add(lunge)
        val plank = ExerciseModel(
            5,
            "Plunk",
            R.drawable.ic_plank
        )
        exerciseList.add(plank)
        val pushUp = ExerciseModel(
            6,
            "Push Up",
            R.drawable.ic_push_up
        )
        exerciseList.add(pushUp)
        val pushUpAndRotation = ExerciseModel(
            7,
            "Push Up and Rotation",
            R.drawable.ic_push_up_and_rotation
        )
        exerciseList.add(pushUpAndRotation)
        val sidePlank = ExerciseModel(
            8,
            "Side Plank",
            R.drawable.ic_side_plank
        )
        exerciseList.add(sidePlank)
        val squat = ExerciseModel(
            9,
            "Squat",
            R.drawable.ic_squat
        )
        exerciseList.add(squat)
        val stepUp = ExerciseModel(
            10,
            "Step Up onto Chair",
            R.drawable.ic_step_up_onto_chair
        )
        exerciseList.add(stepUp)
        val tricepsDip = ExerciseModel(
            11,
            "Triceps Dip on Chair",
            R.drawable.ic_triceps_dip_on_chair
        )
        exerciseList.add(tricepsDip)
        val wallSit = ExerciseModel(
            12,
            "Wall Sit",
            R.drawable.ic_wall_sit
        )
        exerciseList.add(wallSit)

        return  exerciseList
    }
}