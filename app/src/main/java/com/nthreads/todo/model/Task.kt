package com.nthreads.todo.model

import java.util.*

/**
 * Created by Nauman Zubair on 10/11/2017.
 * Copyright (c) 2017 nThreads Apps. All rights reserved.
 */
data class Task(val id: Long, val title: String, var description : String, val createdAt: Date)