/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

/* jshint latedef:false */
/* jshint forin:false */
/* jshint noempty:false */

'use strict';

var util = require('util');
var msRest = require('ms-rest');
var ServiceClient = msRest.ServiceClient;

var models = require('./models');
var operations = require('./operations');

/**
 * @class
 * Initializes a new instance of the AutoRestUrlTestService class.
 * @constructor
 *
 * @param {string} globalStringPath - A string value 'globalItemStringPath' that appears in the path
 *
 * @param {string} [baseUri] - The base URI of the service.
 *
 * @param {object} [options] - The parameter options
 *
 * @param {Array} [options.filters] - Filters to be added to the request pipeline
 *
 * @param {object} [options.requestOptions] - Options for the underlying request object
 * {@link https://github.com/request/request#requestoptions-callback Options doc}
 *
 * @param {boolean} [options.noRetryPolicy] - If set to true, turn off default retry policy
 *
 * @param {string} [options.globalStringQuery] - should contain value null
 *
 */
function AutoRestUrlTestService(globalStringPath, baseUri, options) {
  if (globalStringPath === null || globalStringPath === undefined) {
    throw new Error('\'globalStringPath\' cannot be null.');
  }

  if (!options) options = {};

  AutoRestUrlTestService['super_'].call(this, null, options);
  this.baseUri = baseUri;
  if (!this.baseUri) {
    this.baseUri = 'http://localhost';
  }
  this.globalStringPath = globalStringPath;

    if(options.globalStringQuery !== null && options.globalStringQuery !== undefined) { 
    this.globalStringQuery = options.globalStringQuery;
  }
  this.paths = new operations.Paths(this);
  this.queries = new operations.Queries(this);
  this.pathItems = new operations.PathItems(this);
  this.models = models;
  msRest.addSerializationMixin(this);
}

util.inherits(AutoRestUrlTestService, ServiceClient);

module.exports = AutoRestUrlTestService;
