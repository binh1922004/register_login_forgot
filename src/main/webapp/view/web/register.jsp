<!-- BEGIN CONTENT -->
<div class="col-md-9 col-sm-9">
    <h1>Create an account</h1>
    <div class="content-form-page">
        <div class="row">
            <div class="col-md-7 col-sm-7">
                <form action="/MVC/register" method="post" class="form-horizontal" role="form"
                      enctype="multipart/form-data">
                    <fieldset>
                        <legend>Your personal details</legend>
                        <div class="form-group">
                            <label for="username" class="col-lg-4 control-label">Username<span class="require">*</span></label>
                            <div class="col-lg-8">
                                <input type="text" class="form-control" name="username" id="username" required>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="password" class="col-lg-4 control-label">Password <span class="require">*</span></label>
                            <div class="col-lg-8">
                                <input type="password" class="form-control" name="password" id="password" value="" required>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="fullname" class="col-lg-4 control-label">Full name<span class="require">*</span></label>
                            <div class="col-lg-8">
                                <input type="text" class="form-control" name="fullname" id="fullname" value="" required>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="email" class="col-lg-4 control-label">Email <span class="require">*</span></label>
                            <div class="col-lg-8">
                                <input type="email" class="form-control" name="email" id="email" placeholder="name@example.com" required>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="phone" class="col-lg-4 control-label">Phone <span class="require">*</span></label>
                            <div class="col-lg-8">
                                <input type="text" class="form-control" name="phone" id="phone" value="" required>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="role" class="col-lg-4 control-label">Role<span class="require">*</span></label>
                            <div class="col-lg-8">
                                <select name="role" id="role" class="form-select" aria-label="Default select example">
                                    <option selected>Open this select your role</option>
                                    <option value="1">Admin</option>
                                    <option value="2">Manager</option>
                                    <option value="3">User</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="file" class="col-lg-4 control-label">Upload avatar<span class="require">*</span></label>
                            <div class="col-lg-8">
                                <input type="file" class="form-control" name="file" id="file" value="" required>
                            </div>
                        </div>

                    </fieldset>

                    <fieldset>
                        <legend>Newsletter</legend>
                        <div class="checkbox form-group">
                            <label>
                                <div class="col-lg-4 col-sm-4">Singup for Newsletter</div>
                                <div class="col-lg-8 col-sm-8">
                                    <input type="checkbox">
                                </div>
                            </label>
                        </div>
                    </fieldset>
                    <div class="row">
                        <div class="col-lg-8 col-md-offset-4 padding-left-0 padding-top-20">
                            <button type="submit" class="btn btn-primary">Create an account</button>
                            <button type="button" class="btn btn-default">Cancel</button>
                        </div>
                    </div>
                </form>
            </div>
            <div class="col-md-4 col-sm-4 pull-right">
                <div class="form-info">
                    <h2><em>Important</em> Information</h2>
                    <p>Lorem ipsum dolor ut sit ame dolore  adipiscing elit, sed sit nonumy nibh sed euismod ut laoreet dolore magna aliquarm erat sit volutpat. Nostrud exerci tation ullamcorper suscipit lobortis nisl aliquip  commodo quat.</p>

                    <p>Duis autem vel eum iriure at dolor vulputate velit esse vel molestie at dolore.</p>

                    <button type="button" class="btn btn-default">More details</button>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- END CONTENT -->